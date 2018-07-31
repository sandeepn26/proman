package com.proman.server.dao;

import java.io.Serializable;
import java.util.List;

public interface EntityDao<E> {

    E findById(Serializable id);

    void save(E entity);
    
    List<E> findByCriteria(String criteria, String value);
    
    List<E> findAll();
}
