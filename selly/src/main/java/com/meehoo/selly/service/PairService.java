package com.meehoo.selly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.meehoo.selly.dao.PairDao;

@Transactional
@Service
public class PairService extends BaseService implements IPairService{
	@Autowired
	private PairDao dao;
	public void setPairDao(PairDao dao){
		this.dao = dao;
	}
}
