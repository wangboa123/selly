package com.meehoo.selly.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository("basedao")
public class BaseDao implements IBaseDao{


	@PersistenceContext
	protected EntityManager em;
	
	@Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		em.persist(obj);		
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		em.merge(obj);	
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		em.remove(obj);	
	}

	@Override
	public <T> void deleteById(Class<T> entityClass, Object id) {
		// TODO Auto-generated method stub
		Object obj = queryById(entityClass,id);
		if(obj !=null) delete(obj);
	}

	@Override
	public <T> T queryById(Class<T> entityClass, Object id) {
		// TODO Auto-generated method stub
		return em.find(entityClass,id);
	}

	@Override
	public <T> List<T> queryAll(Class<T> entityClass) {
		// TODO Auto-generated method stub
		StringBuffer jpql = new StringBuffer("from");
		jpql.append(entityClass.getName());
		return em.createQuery(jpql.toString()).getResultList();
	}

	@Override
	public <T> Long countRows(Class<T> entityClass) {
		// TODO Auto-generated method stub
		StringBuffer strBuff = new StringBuffer("select count(*) from ");
		strBuff.append(entityClass.getName());
		return (Long)em.createQuery(strBuff.toString()).getResultList().get(0);
	}

	@Override
	public Long countRows(String queryString, Object... values) {
		// TODO Auto-generated method stub
//		StringBuffer strBuff = new StringBuffer("select count(*) ");
//		strBuff.append(entityClass.getName());
//		Query query = em.createQuery(strBuff.toString();
		return null;

	}

	@Override
	public <T> List<T> queryByJPQL(String queryString, Object... values) {
		// TODO Auto-generated method stub
		Query queryObject = em.createQuery(queryString);
		if(values !=null){
			for(int i=0;i<values.length;i++){
				queryObject.setParameter(i+1,values[i]);
			}
		}
		return queryObject.getResultList();

	}

	@Override
	public List queryBySQL(String sql, Object... values) {
		// TODO Auto-generated method stub
		Query queryObject = em.createNativeQuery(sql);
		if(values !=null){
			for(int i=0;i<values.length;i++){
				queryObject.setParameter(i+1,values[i]);
			}
		}
		return queryObject.getResultList();
	}

	@Override
	public Integer updateByJPQL(String jpql, Object... values) {
		// TODO Auto-generated method stub
		Query queryObject = em.createQuery(jpql);
		if(values !=null){
			for(int i=0;i<values.length;i++){
				queryObject.setParameter(i+1,values[i]);
			}
		}
		return queryObject.executeUpdate();

	}

	@Override
	public Integer updateBySQL(String sql, Object... values) {
		// TODO Auto-generated method stub
		Query queryObject = em.createNativeQuery(sql);
		if(values !=null){
			for(int i=0;i<values.length;i++){
				queryObject.setParameter(i+1,values[i]);
			}
		}
		return queryObject.executeUpdate();
	}
}
