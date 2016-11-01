package com.vee.services;

import java.io.Serializable;
import java.util.List;

public interface IService<T, PK extends Serializable> {
	public List<T> search(PK ID);
	public void create(T t);
	public T read(PK ID);
	public void update(T t);
	public void delete(T t);
}
