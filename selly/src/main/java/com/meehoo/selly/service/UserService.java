package com.meehoo.selly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.meehoo.selly.dao.UserDao;

@Transactional
@Service
public class UserService extends BaseService implements IUserService{
	@Autowired
	private UserDao dao;
	public void setUserDao(UserDao dao){
		this.dao = dao;
	}
}
