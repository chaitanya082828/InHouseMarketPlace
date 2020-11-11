package com.cg.InHouseMarketPlace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.InHouseMarketPlace.model.User;

public interface UserRepository extends JpaRepository<User,String>
{

	User login(User user);

	User logout(User user);

}