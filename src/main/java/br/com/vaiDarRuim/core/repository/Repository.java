package br.com.vaiDarRuim.core.repository;

import java.util.List;

public interface Repository<T> {
    public List<T> getAll();

    public T findById(Object id);

    T findFarmacoByName(String farmacoName);

    public void create(T entity);

    public void update(T entity);

    public void deleteById(Object id);
}
//    void updateByCruzamentos(Object id, T entity);
