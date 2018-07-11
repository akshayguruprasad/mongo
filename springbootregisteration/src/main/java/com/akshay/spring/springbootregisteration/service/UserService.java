package com.akshay.spring.springbootregisteration.service;

import com.akshay.spring.springbootregisteration.modal.User;

public interface UserService {

	User selectUserById(int id);

	User selectAllUsers();

	boolean addUser(User user);

}
