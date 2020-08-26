package com.spring.stockmarket.auth.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.stockmarket.auth.models.AuthenticateRequest;
import com.spring.stockmarket.auth.models.JwtAuthenticationResponse;
import com.spring.stockmarket.auth.models.UserPrincipal;
import com.spring.stockmarket.auth.service.JWTTokenProvider;

@RestController
@RequestMapping("/authenticate")
public class JWTResource {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private JWTTokenProvider jwtTokenProvider;

	@SuppressWarnings("rawtypes")
	@PostMapping
	public ResponseEntity authenticateUser(@RequestBody AuthenticateRequest authenticateRequest) {
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
				authenticateRequest.getUserName(), authenticateRequest.getPassword()));
		String token = jwtTokenProvider.generateToken((UserPrincipal) authentication.getPrincipal());

		return ResponseEntity.ok(new JwtAuthenticationResponse(token));
	}
}
