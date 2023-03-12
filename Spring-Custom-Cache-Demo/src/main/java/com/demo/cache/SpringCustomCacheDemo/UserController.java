package com.demo.cache.SpringCustomCacheDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

	@Autowired
	UserDao userDao;

	@GetMapping(path = "/users")
	public ResponseEntity<Object> getUsers() throws Exception {
		return ApplicationResponse.generateResponse(HttpStatus.OK.toString(), HttpStatus.OK, userDao.listUsers());
	}

	@PostMapping(path = "/save")
	public ResponseEntity<Object> saveUser(@RequestBody User user) {
		return ApplicationResponse.generateResponse(HttpStatus.OK.toString(), HttpStatus.OK, userDao.saveuser(user));
	}

	@GetMapping(path = "/user/{id}")
	public ResponseEntity<Object> getUser(@PathVariable int id ) throws Exception {
		return   ApplicationResponse.generateResponse(HttpStatus.OK.toString(), HttpStatus.OK, userDao.getUser(id));
	}

	@DeleteMapping(path = "/user/{id}")
	public  ResponseEntity<Object> deleteUser(@PathVariable int id ) throws Exception {
		return   ApplicationResponse.generateResponse(HttpStatus.OK.toString(), HttpStatus.OK, userDao.deleteUser(id));
	}
}
