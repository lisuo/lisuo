package com.baseDao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;



public class BaseDaoImpl<T, PK extends Serializable> implements BaseDao <T, PK>
{
	protected Class<T> clazz;
	
	@Autowired
	protected SessionFactory sessionFactory;


	@SuppressWarnings("unchecked")
	public BaseDaoImpl() 
	{
		
		clazz = (Class<T>) getClass().getGenericSuperclass().getClass();
		this.sessionFactory = sessionFactory;
		/*Type genericSuperclass = getClass().getGenericSuperclass();  
        if(genericSuperclass instanceof ParameterizedType){  
            //参数化类型  
            ParameterizedType parameterizedType= (ParameterizedType) genericSuperclass;  
            //返回表示此类型实际类型参数的 Type 对象的数组  
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();  
            this.clazz= (Class<T>)actualTypeArguments[0];  
        }else{  
            this.clazz= (Class<T>)genericSuperclass;  
        }*/
	}
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl(Class clazz, SessionFactory sessionFactory)
	{
		this.clazz = clazz;
		this.sessionFactory = sessionFactory;
	}
	public Session getCurrentSession()
	{
		return this.sessionFactory.getCurrentSession();
	}
	public void save(T entity) {
		this.getCurrentSession().save(entity);
		
	}

	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(PK id) {
		// TODO Auto-generated method stub
		
	}

	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public T get(PK id) 
	{
		//this.getCurrentSession().createQuery("").
		return (T) this.getCurrentSession().get(this.clazz, id);
	}
	
	public List find(String hql, Object... values) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object findUnique(String hql, Object... values) {
		//this.getCurrentSession().
		return null;
	}

	public Integer findInt(String hql, Object... values) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long findLong(String hql, Object... values) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> findByProperty(String propertyName, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	public T findUniqueByProperty(String propertyName, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isPropertyUnique(String propertyName, Object newValue, Object orgValue) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
