package com.vee.dao;

import java.io.Serializable;
import java.util.List;

public interface IDAO<T,PK extends Serializable> {

	public void create(T t);
	public T read(PK ID);
	public void update(T t);
	public void delete(T t);
	public List<T> search(PK ID);
	
}
