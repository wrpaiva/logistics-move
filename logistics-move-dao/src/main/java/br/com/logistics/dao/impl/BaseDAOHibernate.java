package br.com.logistics.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import br.com.logistics.dao.BaseDAO;

public abstract class BaseDAOHibernate extends HibernateDaoSupport implements BaseDAO {
	
	/** {@inheritDoc} */
	public void save(Object object){
		getHibernateTemplate().save(object);
		getHibernateTemplate().flush();
	}
	
	/** {@inheritDoc} */
	public void update(Object object) {
		
		getHibernateTemplate().update(object);
		getHibernateTemplate().flush();
	}
	
	/** {@inheritDoc} */
	public void saveOrUpdate(Object object){
		
		getHibernateTemplate().saveOrUpdate(object);		
		getHibernateTemplate().flush();
	}
	
	/** {@inheritDoc} */
	public void merge(Object object){		
		
		getHibernateTemplate().merge(object);
		getHibernateTemplate().flush();
	}
	
	/** {@inheritDoc} */
	public void evict(Object object){		
		
		getHibernateTemplate().evict(object);
		getHibernateTemplate().flush();
	}	
	
	public <T extends Object> T get(Class<T> clazz, Serializable id){
		return (T)getHibernateTemplate().get(clazz, id);		
	}
	
	public <T extends Object> List<T> loadAll(Class<T> clazz){
		return getHibernateTemplate().loadAll(clazz);
	}
}
