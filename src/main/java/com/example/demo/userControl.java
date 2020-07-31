package com.example.demo;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

//import model.UserReg;
@Service
@RestController
@RequestMapping(path = "/user")
public class userControl {

	@Autowired
	private userDao userDao;
	
	@GetMapping(path="/view", produces = "application/json")
	public users getUsers() {
		return userDao.getUsers();
	}
	
	@PostMapping( path = "/", 
	        consumes = "application/json", 
	        produces = "application/json")
	 public ResponseEntity<Object> addEmployee( @RequestBody UserReg user) {
		 Integer id = userDao.getUsers().getUsers().size()+1;
		 user.setId(id);
		 userDao.addUser(user);
		 
		 URI location = ServletUriComponentsBuilder 
                 .fromCurrentRequest() 
                 .path("/{id}") 
                 .buildAndExpand( 
                     user.getId()).toUri(); 
		 return ResponseEntity 
		            .created(location) 
		            .build(); 
 
		 
	 }

}
