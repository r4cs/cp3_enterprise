package br.com.vaiDarRuim.core.repository;


import br.com.vaiDarRuim.core.entity.Farmaco;
import jakarta.persistence.EntityManager;

public class FarmacoRepo extends JpaRepository<Farmaco> {

    public FarmacoRepo(EntityManager entityManager, Class<Farmaco> entityType) {
        super(entityManager, entityType);
    }
}
