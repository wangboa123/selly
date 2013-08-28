package com.meehoo.selly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.meehoo.selly.dao.BaseDao;

@Transactional
public class BaseService implements IBaseService{
	@Autowired
	private BaseDao baseDao;
	public void setBaseDao(BaseDao baseDao){
		this.baseDao = baseDao;
	}
}
