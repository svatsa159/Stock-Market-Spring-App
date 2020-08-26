package com.spring.stockmarket.backend.service;

import com.spring.stockmarket.backend.exception.EntityExists;
import com.spring.stockmarket.backend.exception.EntityNotFound;
import com.spring.stockmarket.backend.model.UserDetailsEditRequestWrapper;

public interface UserService {

	public boolean updateUser(UserDetailsEditRequestWrapper userDetailsEditRequestWrapper)
			throws EntityExists, EntityNotFound;
}
