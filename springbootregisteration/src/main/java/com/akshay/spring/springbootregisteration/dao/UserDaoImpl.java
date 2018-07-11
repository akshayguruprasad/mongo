package com.akshay.spring.springbootregisteration.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.akshay.spring.springbootregisteration.modal.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public User selectUserById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
