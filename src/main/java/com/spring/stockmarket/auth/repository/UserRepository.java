package com.spring.stockmarket.auth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.stockmarket.auth.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	public User findByUsername(String x);
}
