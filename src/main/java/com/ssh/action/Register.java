package com.ssh.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entity.User;
import com.ssh.service.UserService;

public class Register extends ActionSupport {
	// 表达式封装
	private User user;

	// 生成get,set方法
	public User getUser() {
		return user;
	}
	public void setUser(User user) {

		this.user = user;
	}


	private UserService service;


	public void setService(UserService service) {
		this.service = service;
	}
	public String execute() {
	    HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		session.setAttribute("user", user);
		service.add(user);
		return "ok";
	}

}
