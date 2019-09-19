package com.capgemini.bookstore.service;

import java.util.List;

import com.capgemini.bookstore.bean.User;

public interface UserService {

	User addUser(User user);

	List<User> getAllUsers() ;

	List<User> updateUser(Integer id, User user);

	List<User> deleteUser(Integer id) ;
	
	 User findByIdPass(String email,String pass);

	User getUser(int id);
	    
}
