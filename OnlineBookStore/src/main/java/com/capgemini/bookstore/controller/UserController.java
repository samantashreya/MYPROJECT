package com.capgemini.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bookstore.bean.User;
import com.capgemini.bookstore.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/users/create_user")
	public User addUser(@RequestBody User user) {
		System.out.println("asdas");
		System.out.println(user+"sadsad");
		return userService.addUser(user);

	}

	@GetMapping("/users/list_users")
	public List<User> getAllUsers() {
		System.out.println("getallusers");
		return userService.getAllUsers();
	}

	@PutMapping("/users/{id}")
	public List<User> updateUser(@RequestBody User user, @PathVariable Integer id) {
		return userService.updateUser(id, user);
	}

	@DeleteMapping("/users/delete/{id}")
	public List<User> deleteUser(@PathVariable Integer id)  {
		System.out.println("heeee");
		System.out.println(id);
		return userService.deleteUser(id);
	}
	@GetMapping(path = { "/users/{email}/{password}" })
	public User findUser(@PathVariable("email") String email, @PathVariable("password") String password) {
		System.out.println(email);
		System.out.println("sadas");
		return userService.findByIdPass(email, password);
	}
	
	@GetMapping("/users/Id/{id}")
	public User getUser(@PathVariable Integer id) {
		//System.out.println("sadfsaf");
		return userService.getUser(id);
	}
}
	
