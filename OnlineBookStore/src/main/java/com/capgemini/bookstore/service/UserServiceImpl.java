package com.capgemini.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bookstore.bean.User;
import com.capgemini.bookstore.dao.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userDao;
	
	@Override
	public User addUser(User user)  {
		System.out.println(user);
			return userDao.save(user);
	}

	@Override
	public List<User> getAllUsers(){
		System.out.println("asd");
			return userDao.findAll();
		
	}

	
	@Override
	public List<User> updateUser(Integer id, User user)  {
		if(userDao.existsById(user.getId())) {
			userDao.save(user);
			return getAllUsers();
		}
		return null;
			}


	@Override
	public List<User> deleteUser(Integer id) {
		if(userDao.existsById(id)) {
			userDao.deleteById(id);
			return getAllUsers();
	}return null;
		
}
	
	
	@Override
	public User findByIdPass(String email, String pass) {
		User user = userDao.findByEmail(email);
		System.out.println(user);
		if(user.getPassword().equals(pass)) {
			System.out.println(user);
			return user;
		}
		else {
		return new User(0,"","","");
		}
	}

	@Override
	public User getUser(int id) {

		return userDao.findById(id).get();
	}
}
