package com.sr.springboot.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.sr.springboot.model.User;



@Service("userService")
public class UserServiceImpl implements UserService{
	
	private static final AtomicLong counter = new AtomicLong();
	
	private static List<User> users;

	static{
		users = populateDummyUsers();
	}

	public void saveUser(User user) {
		user.setId(counter.incrementAndGet());
		users.add(user);
	}

	public User findByAccNumber(String accNumber) {
		for(User user : users){
			if(user.getAccNumber().equalsIgnoreCase(accNumber)){
				return user;
			}
		}
		return null;
	}
	
	private static List<User> populateDummyUsers(){
		List<User> users = new ArrayList<User>();
		users.add(new User(counter.incrementAndGet(),"75263452","1234567890", "Alpharetta-GA"));
		users.add(new User(counter.incrementAndGet(),"52646678","6786773511", "Dallas-TX"));
		users.add(new User(counter.incrementAndGet(),"36987656","6784776026", "Tampa-FL"));
		users.add(new User(counter.incrementAndGet(),"12345678","9729993072", "Atlanta-GA"));
		return users;
	}

}
