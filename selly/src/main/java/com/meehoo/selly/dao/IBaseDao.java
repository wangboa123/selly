package com.meehoo.selly.dao;

import java.util.List;

public interface IBaseDao {

	/*save method*/
	public void save(Object obj);


	/*update method*/
	public void update(Object obj);

	/*delete method*/
	public void delete(Object obj);

	/*delete by id*/
	public <T> void deleteById(Class<T> entityClass,Object id);

	/*query by id*/
	public <T> T queryById(Class<T> entitiyClass,Object id);

	/*query all*/
	public <T> List<T> queryAll(Class<T> entityClass);

	/*query record numbers*/
	public <T> Long countRows(Class<T> entityClass);
	public Long countRows(final String queryString,final Object ... values);

	/*query by jpql*/
	public <T> List<T> queryByJPQL(final String queryString,final Object ... values);

	/*query by sql*/
	public List queryBySQL(final String sql,final Object ... values);

	/*update by jpql*/
	public Integer updateByJPQL(final String jpql,final Object ...values);

	/*update by sql*/
	public Integer updateBySQL(final String sql,final Object ...values);
	
}
