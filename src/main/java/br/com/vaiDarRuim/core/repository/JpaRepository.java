package br.com.vaiDarRuim.core.repository;

import br.com.vaiDarRuim.core.entity.Farmaco;
import jakarta.persistence.EntityManager;

import java.util.List;

import jakarta.transaction.Transactional;

public class JpaRepository<T> implements Repository<T> {

    protected EntityManager entityManager;
    private final Class<T> entityType;

    public JpaRepository(EntityManager entityManager, Class<T> entityType) {
        this.entityManager = entityManager;
        this.entityType = entityType;
    }

    @Override
    public List<T> getAll() {
        var jpql = "SELECT u FROM " + entityType.getSimpleName() + " u";
        var query = entityManager.createQuery(jpql, entityType);
        return query.getResultList();
    }

    @Override
    public T findById(Object id) {
        return entityManager.find(entityType, id);
    }


    @Override
    public T findFarmacoByName(String farmacoName) {
        var jpql = "SELECT u FROM Farmaco u WHERE u.nomeDaSubstancia = :name";
        var query = entityManager.createQuery(jpql, entityType);
        query.setParameter("name", farmacoName);

        List<T> result = query.getResultList();

        if (result.isEmpty()) {
            return null; // Ou lança uma exceção ou retorna o que fizer sentido para seu caso
        }

        return result.get(0);
    }

    @Override
    @Transactional
    public void create(T entity) {
        try {
            entityManager.persist(entity);
//            if (entity instanceof Farmaco) {
//                Farmaco farmaco = (Farmaco) entity;
//                updateByCruzamentos((Object) farmaco.getFarmacoId(), (T) farmaco);
//            }

        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        }
    }

//    @Override
//    public void updateByCruzamentos(Object id, T entity) {
//        try {
//            T existingEntity = findById(id);
//            System.out.println("existing entity: " + existingEntity.toString());
//            if (existingEntity == null) {
//                throw new EntityNotFoundException("Entidade não encontrada com ID: " + id);
//            }
//
//            Farmaco farmacoPrincipal = (Farmaco) entity;
//            System.out.println("farmacoPrincipal: " + farmacoPrincipal.toString());
//            Map<String, Classificacao> cruzamentosFarmacoPrincipal = farmacoPrincipal.getCruzamentos();
//            for(Map.Entry<String, Classificacao> entry : cruzamentosFarmacoPrincipal.entrySet()) {
//
//                String key = entry.getKey();
//                Classificacao value = entry.getValue();
//                System.out.println("key: " + key);
//                System.out.println("value: " + value);
//            }
//
//            if (entity instanceof Farmaco) {
//                System.out.println("is instance of farmaco: " + (entity instanceof Farmaco));
//                Farmaco farmacoAtualizado = (Farmaco) entity;
//                System.out.println("farmaco atualizado: " + farmacoAtualizado.toString());
//                Farmaco farmacoExistente = (Farmaco) existingEntity;
//                System.out.println("fármaco existente: " + farmacoExistente.toString());
//
//                Map<String, Classificacao> cruzamentosAtualizados = farmacoAtualizado.getCruzamentos();
//                System.out.println("cruzamentos atualizados: " + cruzamentosAtualizados.toString());
//                Map<String, Classificacao> cruzamentosExistente = farmacoExistente.getCruzamentos();
//                System.out.println("cruzamentos existentes: " + cruzamentosExistente);
//
//                // Verifica e atualiza ou insere cruzamentos existentes
//                for (Map.Entry<String, Classificacao> entry : cruzamentosAtualizados.entrySet()) {
//                    String substancia = entry.getKey();
//                    Classificacao classificacao = entry.getValue();
//
//                    if (cruzamentosExistente.containsKey(substancia)) {
//                        // Se já existe, atualiza
//                        cruzamentosExistente.put(substancia, classificacao);
//                    } else {
//                        // Se não existe, cria um novo farmaco e adiciona ao cruzamento
//                        Farmaco novoFarmaco = new Farmaco(substancia, Map.of(farmacoExistente.getNomeDaSubstancia(), classificacao));
//                        create((T) novoFarmaco);
//                    }
//                }
//
//                entityManager.merge(existingEntity);
//            } else {
//                throw new IllegalArgumentException("A entidade fornecida não é do tipo esperado.");
//            }
//        } catch (Exception e) {
//            entityManager.getTransaction().rollback();
//            throw e;
//        }
//    }


    @Override
    @Transactional
    public void update(T entity) {
        entityManager.merge(entity);
    }

    @Override
    @Transactional
    public void deleteById(Object id) {
        var entity = findById(id);
        if (entity != null) {
            try {
                entityManager.remove(entity);
            } catch (Exception e) {
                entityManager.getTransaction().rollback();
                throw e;
            }
        }
    }
}
