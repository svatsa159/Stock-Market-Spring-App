package com.spring.stockmarket.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.stockmarket.backend.exception.EntityExists;
import com.spring.stockmarket.backend.exception.EntityNotFound;
import com.spring.stockmarket.backend.model.UserDetailsEditRequestWrapper;
import com.spring.stockmarket.backend.service.UserServiceImpl;

@RestController
@RequestMapping("/update_user")
public class UpdateUserDetails {
	@Autowired
	UserServiceImpl userServiceImpl;

	@PostMapping
	public ResponseEntity<Object> updateUserDetails(
			@RequestBody UserDetailsEditRequestWrapper userDetailsEditRequestWrapper) {
		try {
			userServiceImpl.updateUser(userDetailsEditRequestWrapper);
			return ResponseEntity.ok(null);
		} catch (EntityExists e) {
			return new ResponseEntity<>("Username Exists", HttpStatus.BAD_REQUEST);
		} catch (EntityNotFound e) {
			return new ResponseEntity<>("User not found", HttpStatus.BAD_REQUEST);
		}

	}
}
