package com.proman.server.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings("unchecked")
public abstract class AbstractDao<E> implements EntityDao<E> {

    private final Class<E> entityClass;

    public AbstractDao() {
        this.entityClass = (Class<E>) ((ParameterizedType) this.getClass().getGenericSuperclass())
            .getActualTypeArguments()[0];
    }

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public E findById(final Serializable id) {
        return getSession().get(entityClass, id);
    }

    @Override
    public void save(E entity) {
        getSession().saveOrUpdate(entity);
    }
    
    @Override
    public List<E> findByCriteria(String name, String value) {
    	Session session = getSession();
    	CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<E> query = getQueryCriteria();
        Root<E> root = query.from(entityClass);
        query.select(root).where(builder.equal(root.get(name), value));
        // query.having(builder.equal(root.get(name), value));
        Query q=session.createQuery(query);
        List<E> list=q.getResultList();
    	return list;
    }
    
    protected CriteriaQuery<E> getQueryCriteria() {
    	CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<E> query = builder.createQuery(entityClass);
        return query;
    }
    
    @Override
    public List<E> findAll() {
    	Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<E> query = builder.createQuery(entityClass);
        Root<E> root = query.from(entityClass);
        query.select(root);
        Query q=session.createQuery(query);
        List<E> users=q.getResultList();
        return users;
    }
    
    
}
