package com.spring.stockmarket.backend.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.spring.stockmarket.auth.entity.User;
import com.spring.stockmarket.auth.repository.UserRepository;
import com.spring.stockmarket.backend.exception.EntityExists;
import com.spring.stockmarket.backend.exception.EntityNotFound;

@Service
public class UserDaoImpl implements UserDao {
	@Autowired
	UserRepository userRepository;

	@Override
	public User getUserbyId(long id) throws EntityNotFound {
		Optional<User> optionalUser = userRepository.findById(id);
//		User user = userRepository.findByUsername(username);
		User user = optionalUser.orElse(null);
		if (user == null) {
			throw new EntityNotFound();
		} else {
			return user;
		}

	}

	@Override
	public boolean saveUser(User user) throws EntityExists {
		try {
			userRepository.save(user);
			return true;
		} catch (DataIntegrityViolationException e) {
			throw new EntityExists();
		}
	}

}
