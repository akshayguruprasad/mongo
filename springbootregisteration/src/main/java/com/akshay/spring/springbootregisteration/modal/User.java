package com.akshay.spring.springbootregisteration.modal;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * User entity
 * 
 * @author Akshay
 *
 */
@Document(collection = "employee")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	 @Id ObjectId databaseId;
	public ObjectId getDatabaseId() {
		return databaseId;
	}

	public void setDatabaseId(ObjectId databaseId) {
		this.databaseId = databaseId;
	}


	private String firstName;
	private String lastName;
	@Indexed(unique=true)
	private String email;
	private String mobile;


	@Override
	public String toString() {
		return "User [databaseId=" + databaseId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", mobile=" + mobile + "]";
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(ObjectId databaseId, String firstName, String lastName, String email, String mobile) {
		super();
		this.databaseId = databaseId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


}
