package br.com.logistics.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDAO {
	
    public void save(Object object);
	
	public void update(Object object);

	public void saveOrUpdate(Object object);	

	public void delete(Object object);	
	
	public <T extends Object> T get(Class<T> clazz, Serializable id);
	
	public <T extends Object> List<T> loadAll(Class<T> clazz);

}
