package com.spring.stockmarket.auth.resource;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user_logout")
public class UserLogout {

	@GetMapping
	public ResponseEntity<Object> logoutUser(HttpServletRequest request, HttpServletResponse response) {

		return ResponseEntity.ok(null);
	}
}
