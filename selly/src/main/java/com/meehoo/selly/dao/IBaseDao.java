package com.meehoo.selly.dao;

import java.util.List;

public interface IBaseDao{
	/*sava */
	public void save(Object obj);

	/*update*/
	public void update(Object obj);

	/*delete*/
	public void delete(Object obj);

	/*delete By id */
	public <T> void deleteById(Class<T> entityClass,Object obj);

	/*query by id*/
	public <T> T queryById(Class<T> entityClass,Object obj);

	/*query all*/
	public <T> List<T> queryAll(Class<T> entityClass);

	/*count rows*/
	public <T> Long countRows(Class<T> entityClass);
	public Long countRows(final String queryString,final Object ...values);

	/*query by jpql and sql*/
	public <T> List<T> queryByJpql(final String jpql,final Object ...values);
	public <T> List<T> queryBySql(final String sql,final Object ... values);

	/*update by jpql and sql*/
	public Integer updateByJpql(final String jpql,final Object ...values);
	public Integer updateBySql(final String sql,final Object ...values);

}

