package com.spring.stockmarket.backend.model;

public class UserDetailsEditRequestWrapper {
	long id;
	String username;

	String password;
	String email;
	String phoneNo;

	UserDetailsEditRequestWrapper() {

	}

	public long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	@Override
	public String toString() {
		return "UserDetailsEditRequestWrapper [userId=" + id + ", username=" + username + ", mobileno=" + phoneNo
				+ ", password=" + password + ", email=" + email + "]";
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}
}
