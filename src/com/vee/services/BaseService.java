package com.vee.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.vee.dao.IDAO;

@Transactional(readOnly=true)
public abstract class BaseService<T,PK extends Serializable> implements IService<T, PK> {

	private IDAO<T, PK> dao;
	
	public void setDao(IDAO<T, PK> dao) {
		this.dao = dao;
	}

	@Override
	public List<T> search(PK ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void create(T t) {
		dao.create(t);
	}

	@Override
	public T read(PK ID) {
		// TODO Auto-generated method stub
		return dao.read(ID);
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub
		
	}


}
