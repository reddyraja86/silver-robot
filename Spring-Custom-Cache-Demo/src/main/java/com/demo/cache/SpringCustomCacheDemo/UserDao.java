package com.demo.cache.SpringCustomCacheDemo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
	
	@Autowired
	private UserRepository userRepository;

	public User saveuser(User user) {
		return userRepository.save(user);
	}
	
	public List<User> listUsers() throws Exception {
		return userRepository.findAll();
	}

	@Cacheable(cacheNames = "users" ,key = "#id")
	public Optional<User> getUser(int id) throws Exception {
		return userRepository.findById(id);
	}

	@CacheEvict(cacheNames = "users" ,key = "#id")
	public Object deleteUser(int id) throws Exception {
		Optional<User> user = getUser(id);
		User u= user.get();
		userRepository.delete(u);
		return true;
	}

	public Optional<User> getUserNo(int id) throws Exception {
		return getUser(id) ;
	}
}
