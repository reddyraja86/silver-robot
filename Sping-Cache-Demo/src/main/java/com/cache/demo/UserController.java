package com.cache.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
}
