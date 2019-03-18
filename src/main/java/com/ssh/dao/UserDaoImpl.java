package com.ssh.dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.entity.User;
@Transactional
public class UserDaoImpl implements UserDao{
  
	private HibernateTemplate hibernateTemplate;
	
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Override
	public void insert(User user) {
	    HttpServletRequest request=ServletActionContext.getRequest();
	    HttpSession session=request.getSession();
		user=(User) session.getAttribute("user");
		hibernateTemplate.save(user);
	}
     
}
