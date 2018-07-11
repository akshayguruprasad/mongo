package com.akshay.spring.springbootregisteration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.akshay.spring.springbootregisteration.modal.User;
@Component("repo")
public interface UserRepository extends MongoRepository<User,Integer> {}