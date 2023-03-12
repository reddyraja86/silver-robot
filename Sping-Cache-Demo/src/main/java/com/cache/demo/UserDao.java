package com.cache.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
	
	@Autowired
	private UserRepository userRepository;

	public User saveuser(User user) {
		return userRepository.save(user);
	}
	
	public List<User> listUsers() throws Exception {
		// throw new NullPointerException();
		return userRepository.findAll();
	}
}
