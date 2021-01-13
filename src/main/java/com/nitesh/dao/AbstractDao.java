package com.nitesh.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.usertype.ParameterizedType;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao<T>{
	
	//public final Class<T> persistence;
	
	@Autowired
	private SessionFactory sessionFactory;

//	@SuppressWarnings("unchecked")
//	public AbstractDao() {
//		this.persistence = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
//				.getActualTypeArguments()[0];
//	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public T saveDetail(T entity) {
		return (T) getSession().merge(entity);
	}
	
	public void update(T entity) {
		getSession().update(entity);
	}
	
	public void delete(T entity) {
		getSession().delete(entity);
	}
	
//	public T get(int id) {
//		return getSession().get(persistence, id);
//	}
}
