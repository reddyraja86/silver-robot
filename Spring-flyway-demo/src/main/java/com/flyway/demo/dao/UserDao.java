package com.flyway.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.flyway.demo.model.User;
import com.flyway.demo.repository.UserRepository;

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
