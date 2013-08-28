package com.meehoo.selly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.meehoo.selly.dao.AdminDao;

@Transactional
@Service
public class AdminService extends BaseService implements IAdminService{
		@Autowired
		private AdminDao dao;
		public void setDao(AdminDao dao){
			this.dao = dao;
		}
}
