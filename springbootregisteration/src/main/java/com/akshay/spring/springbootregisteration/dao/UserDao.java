package com.akshay.spring.springbootregisteration.dao;

import java.util.List;

import com.akshay.spring.springbootregisteration.modal.User;

public interface UserDao {

	User selectUserById();
	List<User> selectAllUsers();
	boolean addUser(User user);
	
}
