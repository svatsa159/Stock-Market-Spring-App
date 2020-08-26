package com.spring.stockmarket.auth.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.stockmarket.auth.entity.User;
import com.spring.stockmarket.auth.repository.UserRepository;

@RestController
@RequestMapping("/signup")
public class SignupResource {
	@Autowired
	UserRepository userRepository;

	@PostMapping
	public ResponseEntity<Object> signup_user(@RequestBody User user) {

		try {
			user.setConfirmed(false);
			user.setUserType("ROLE_USER");
			userRepository.save(user);
			// TODO Add email Verification
			return ResponseEntity.ok(null);
		} catch (DataIntegrityViolationException e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}
}
