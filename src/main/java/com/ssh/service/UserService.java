package com.ssh.service;

import com.ssh.dao.UserDao;
import com.ssh.entity.User;

public class UserService {
   
	private UserDao dao;

	public void setDao(UserDao dao) {
		this.dao = dao;
	}


	public void add(User user) {
		dao.insert(user);
		
	}

}
