package com.meehoo.selly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.meehoo.selly.dao.BaseDao;
import com.meehoo.selly.dao.ClothesDao;

@Transactional
@Service
public class ClothesService extends BaseDao implements IClothesService{
	@Autowired
	private ClothesDao dao;
	public void setClothesDao(ClothesDao dao){
		this.dao =dao;
	}
}
