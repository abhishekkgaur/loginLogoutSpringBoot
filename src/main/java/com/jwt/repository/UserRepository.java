package com.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	//username, it will return the user of given username; 
	public User findByUsername(String username);
	

}
