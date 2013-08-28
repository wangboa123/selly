package com.meehoo.selly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.meehoo.selly.dao.BaseDao;
import com.meehoo.selly.dao.DiscountDao;
@Transactional
@Service
public class DiscountService extends BaseDao implements IDiscountService{
	@Autowired
	private DiscountDao dao;
	public void setDiscountDao(DiscountDao dao){
		this.dao =dao;
	}
}
