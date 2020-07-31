package com.example.demo;

import java.util.ArrayList;

import java.util.List;

//import model.UserReg;

public class users {
	
	private List<UserReg> users;
	
	public List<UserReg> getUsers() 
    { 
  
        if (users == null) { 
  
            users = new ArrayList<>(); 
  
                    
        } 
  
        return users; 
  
            
    } 
  
    public void
    setEmployeeList( List<UserReg> users) 
    { 
        this.users  = users; 
    } 
}
