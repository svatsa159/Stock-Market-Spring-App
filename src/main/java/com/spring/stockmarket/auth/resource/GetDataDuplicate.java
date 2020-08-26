package com.spring.stockmarket.auth.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.stockmarket.auth.entity.User;
import com.spring.stockmarket.auth.repository.UserRepository;

@RestController
@RequestMapping("/getdata")
@PreAuthorize("hasRole('USER')")
public class GetDataDuplicate {
	@Autowired
	UserRepository usr;

	@GetMapping
	public User injectData() {
//		User user = new User(1, "user1", "user1", "USER", "user1@stockmarket.com", "9999999999", false);
//		usr.save(user);
//		return ("done");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		auth.getClass();
		System.out.println(auth.getName());

		return usr.findByUsername(auth.getName());

	}
}