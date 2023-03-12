package com.flyway.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flyway.demo.dao.UserDao;
import com.flyway.demo.response.ApplicationResponse;

@RestController
public class UserController {

	@Autowired
	UserDao userDao;

	@GetMapping(path = "/users")
	public ResponseEntity<Object> getUsers() throws Exception {
	    return ApplicationResponse.generateResponse(HttpStatus.OK.toString(), HttpStatus.OK, userDao.listUsers());
	}
}
