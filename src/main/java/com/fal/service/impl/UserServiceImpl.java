package com.fal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.fal.dao.UserMapper;
import com.fal.entity.User;
import com.fal.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUserByUsername(String user) {

		User user1 = userMapper.selectUser1(user);

		return user1;

	}

}
