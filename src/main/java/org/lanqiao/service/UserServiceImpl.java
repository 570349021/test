package org.lanqiao.service;

import org.lanqiao.dao.UserDao;
import org.lanqiao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;
	@Override
	public User CheckUser(User user) {
		return userDao.CheckUser(user);
	}

}
