package com.example.findbook.service;


import com.example.findbook.entities.User;

public interface UserService {

	boolean saveUser(User user);

	User findUserByEmail(String email);

}
