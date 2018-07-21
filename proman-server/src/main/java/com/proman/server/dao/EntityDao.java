package com.proman.server.dao;

import java.io.Serializable;

public interface EntityDao<E> {

    E findById(Serializable id);

    void save(E entity);
}
