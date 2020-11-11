package com.cg.InHouseMarketPlace.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.InHouseMarketPlace.model.User;
import com.cg.InHouseMarketPlace.service.UserService;

@RestController
public class UserController {
	
	private UserService userService;
		
	public User login(@RequestBody User user) {
		User user1 = userService.login(user);
		if(user1!=null)
		{
			if(user1.getPassword().equals(user.getPassword()))
			{
				return user;
			}
		}
		else
		{
			System.out.println("Invalid Details");
		}
		return user;
	}
	
		public ResponseEntity<User> logout(@RequestBody User user) {
			User user1 = userService.logout(user);
			return new ResponseEntity<User>(user, HttpStatus.OK);
		}
	
	@PostMapping("/addUser")
	public ResponseEntity<User> add(@RequestBody User user) {
		User user1 = userService.addUser(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}


	@PutMapping("/updateUser")
	public ResponseEntity<User> update(@RequestBody User user) {
		User user1=userService.editUser(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);

	}
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<User> delete(@PathVariable String userId) {
		User user=userService.deleteUser(userId);
		return new ResponseEntity<User>(user, HttpStatus.OK);

	}
		
}