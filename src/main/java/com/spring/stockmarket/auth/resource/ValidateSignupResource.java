package com.spring.stockmarket.auth.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.stockmarket.auth.entity.User;
import com.spring.stockmarket.auth.repository.UserRepository;

@RestController
@RequestMapping("/signup/validate/")
public class ValidateSignupResource {
	@Autowired
	UserRepository userRepository;

	@PostMapping
	public ResponseEntity<Object> validateUser(@RequestParam(name = "username") String username,
			@RequestParam(name = "code") String code) {

		if (code.equals("abcd")) {
			User user = null;

			user = userRepository.findByUsername(username);

			if (user == null) {
				return new ResponseEntity<>("User Doesn't exist", HttpStatus.BAD_REQUEST);
			}
			if (user.getConfirmed() == true) {
				return new ResponseEntity<>("User already verified", HttpStatus.BAD_REQUEST);
			}
			user.setConfirmed(true);
			userRepository.save(user);
			return ResponseEntity.ok(null);
		} else {
			return new ResponseEntity<>("Incorrect Code", HttpStatus.BAD_REQUEST);
		}

	}
}
