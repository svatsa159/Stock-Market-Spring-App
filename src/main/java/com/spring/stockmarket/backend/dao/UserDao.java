package com.spring.stockmarket.backend.dao;

import com.spring.stockmarket.auth.entity.User;
import com.spring.stockmarket.backend.exception.EntityExists;
import com.spring.stockmarket.backend.exception.EntityNotFound;

public interface UserDao {
	public User getUserbyId(long id) throws EntityNotFound;

	public boolean saveUser(User user) throws EntityExists;
}
