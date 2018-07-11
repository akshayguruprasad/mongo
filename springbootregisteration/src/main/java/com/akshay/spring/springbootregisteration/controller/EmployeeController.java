package com.akshay.spring.springbootregisteration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.akshay.spring.springbootregisteration.modal.User;
import com.akshay.spring.springbootregisteration.service.UserService;

@RestController
public class EmployeeController {

	@Autowired
	UserService service;

	@RequestMapping(path="/",method=RequestMethod.GET)
public	String sample() {
		
		System.out.println("Welcome ");
		return "Hello ";
	}

	@RequestMapping(value = "/user/get/{idValue}", method = RequestMethod.GET)
	public ResponseEntity<User> getUser(@PathVariable("idValue") String id) {
		User user = null;
		int searchId = 0;
		System.out.println("Hits ");
		ResponseEntity<User> response = null;
		try {

			searchId = Integer.parseInt(id);
			user = service.selectUserById(searchId);
			if (user == null) {
				throw new Exception("No records found");

			}

			response = new ResponseEntity<User>(user, HttpStatus.OK);

		} catch (Exception e) {

			response = new ResponseEntity<User>(user, HttpStatus.NOT_FOUND);

		}
		return response;

	}

	@RequestMapping(value = "/user/register", method = RequestMethod.POST)
	public ResponseEntity<String> registerUser(@RequestBody User newUser) {
		boolean isInserted = false;
		ResponseEntity<String> response = null;
		try {

			isInserted = service.addUser(newUser);

			if (!isInserted) {
				throw new Exception("Could not insert the user");
			}

			response = new ResponseEntity<String>(newUser.toString(), HttpStatus.OK);

		} catch (Exception e) {

			response = new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);

		}
		return response;
	}

}
