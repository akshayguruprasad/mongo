package com.akshay.spring.springbootregisteration.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Akshay
 *
 */

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.akshay.spring.springbootregisteration.service",
		"com.akshay.spring.springbootregisteration.dao", "com.akshay.spring.springbootregisteration.repository","com.akshay.spring.springbootregisteration.controller" })
@EnableMongoRepositories(basePackages="com.akshay.spring.springbootregisteration.repository")
public class MainClass {

	public static void main(String[] args) {

		SpringApplication.run(MainClass.class, args);

	}
	


}



