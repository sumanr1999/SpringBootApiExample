package com.sr.springboot.service;


import java.util.List;

import com.sr.springboot.model.User;

public interface UserService {

	void saveUser(User user);
	User findByAccNumber(String accNumber);
	
}
