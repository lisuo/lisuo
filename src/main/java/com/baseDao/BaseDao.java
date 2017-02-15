package com.baseDao;

import java.io.Serializable;
import java.util.List;



public interface BaseDao <T, PK extends Serializable>
{
	public void save(T entity);

	public void delete(T entity);

	public void delete(PK id);

	public List<T> findAll();

//	public Page<T> findAll(Page<T> page);

	
	public T get(final PK id);

	
	public List find(String hql, Object... values);

	
//	public Page<T> find(Page<T> page, String hql, Object... values);

	public Object findUnique(String hql, Object... values);

	public Integer findInt(String hql, Object... values);

	public Long findLong(String hql, Object... values);

//	public List<T> findByCriteria(Criterion... criterion);

//	public Page<T> findByCriteria(Page page, Criterion... criterion);

	public List<T> findByProperty(String propertyName, Object value);

	public T findUniqueByProperty(String propertyName, Object value);

//	public Query createQuery(String queryString, Object... values);

//	public Criteria createCriteria(Criterion... criterions);

	public boolean isPropertyUnique(String propertyName, Object newValue,
			Object orgValue);

//	public int countQueryResult(Page<T> page, Criteria c); 
}
