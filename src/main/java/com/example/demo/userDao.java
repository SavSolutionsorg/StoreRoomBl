package com.example.demo;

import org.springframework.stereotype.Service;

//import model.UserReg;
@Service
public class userDao {
	
	private static users user = new users();
	
	static {
		user.getUsers().add(new UserReg("vipin","123", "123", "123", "123", "123"));
	}
	
	public users getUsers()  {
		return user;
	}
	
	public void addUser(UserReg userReg) {
		user.getUsers().add(userReg);
	}

}
