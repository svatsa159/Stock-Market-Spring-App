package com.spring.stockmarket.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.stockmarket.auth.entity.User;
import com.spring.stockmarket.backend.dao.UserDaoImpl;
import com.spring.stockmarket.backend.exception.EntityExists;
import com.spring.stockmarket.backend.exception.EntityNotFound;
import com.spring.stockmarket.backend.model.UserDetailsEditRequestWrapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDaoImpl userDaoImpl;

	@Override
	public boolean updateUser(UserDetailsEditRequestWrapper userDetailsEditRequestWrapper)
			throws EntityExists, EntityNotFound {

		User user = userDaoImpl.getUserbyId(userDetailsEditRequestWrapper.getId());
		user.setMobileNo(userDetailsEditRequestWrapper.getPhoneNo());
		user.setEmail(userDetailsEditRequestWrapper.getEmail());
		user.setUsername(userDetailsEditRequestWrapper.getUsername());
		user.setPassword(userDetailsEditRequestWrapper.getPassword());
		userDaoImpl.saveUser(user);
		return false;
	}

}
