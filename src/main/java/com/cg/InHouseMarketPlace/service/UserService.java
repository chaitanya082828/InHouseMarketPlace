package com.cg.InHouseMarketPlace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.InHouseMarketPlace.model.User;
import com.cg.InHouseMarketPlace.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	//public User login(User user) {
		//return user.login(user);
//	}
	
	public User login(User user)
	{
		return userRepository.login(user);
	}
	
	public User logout(User user)
	{
		return userRepository.logout(user);
	}
	
	
	public User addUser(User user)
	{
		return userRepository.save(user);
	}
	
	
	public User editUser(User user)
	{
		if(userRepository.findById(user.getUserId()) != null){
			return userRepository.save(user);
		}
		else {
			return null;
		}
	}
	
	public User deleteUser(String id)
	{
		userRepository.deleteById(id);
		return null;
	}

}