package com.akshay.spring.springbootregisteration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.akshay.spring.springbootregisteration.dao.UserDao;
import com.akshay.spring.springbootregisteration.modal.User;
import com.akshay.spring.springbootregisteration.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	@Autowired(required=true)
	@Qualifier("repo")
	UserRepository userRepository;

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User selectUserById(int id) {
		
		System.out.println("selectUserById");
		User user = null;
		try {

			List<User> usersList = userRepository.findAll();
			for (User user2 : usersList) {
				System.out.println("-");
				System.out.println(user2);
				System.out.println("-");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;

	}

	@Override
	public User selectAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
