package com.acm.service.Impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.acm.bean.User;
import com.acm.dao.impl.UserDaoImpl;
import com.acm.service.UserService;

/**
* @author 计算机网络软件应用1501 路素飞
* QQ 2512977541
* @version 创建时间：2017年11月9日 下午4:34:29
* 类说明
*/
@Service
public class UserServiceImpl implements UserService{

	@Resource
	UserDaoImpl UserDaoImpl;
	@Override
	public void add() {
		// TODO Auto-generated method stub
		User user = new User();
		UserDaoImpl.save(user);
	}
   
	
}
