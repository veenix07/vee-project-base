package com.vee.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("baseDAO")
public abstract class BaseDAO<T,PK extends Serializable> extends HibernateDaoSupport implements IDAO<T,PK> {

	private Class<T> type;
	
	public BaseDAO(Class<T> type) {
		this.type = type;
	}
	
	@Autowired
	public void setSessionFactoryInit(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}
	
	@Override
	public void create(T t) {
		getHibernateTemplate().saveOrUpdate(t);
	}

	@Override
	public T read(PK ID) {
		return getHibernateTemplate().get(type, ID);
	}

	@Override
	public void update(T t) {
		getHibernateTemplate().merge(t);
	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> search(PK ID) {
		// TODO Auto-generated method stub
		return null;
	}

}
