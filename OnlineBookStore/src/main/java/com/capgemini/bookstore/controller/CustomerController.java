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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bookstore.bean.Customer;
import com.capgemini.bookstore.exception.CustomerException;
import com.capgemini.bookstore.service.CustomerService;

@CrossOrigin("*")
@RestController

public class CustomerController {
	@Autowired
	public CustomerService service;

	@GetMapping("/customer")
	public List<Customer> getAllCustomers() throws CustomerException {
		return service.getAllCustomers();
	}

	@PostMapping("/customer")

	public List<Customer> addCustomer(@RequestBody Customer customer) throws CustomerException {
		return service.addCustomer(customer);
	}

	@DeleteMapping("/customer/{id}")
	public List<Customer> deleteCustomer(@PathVariable int id) throws CustomerException {
		return service.deleteCustomer(id);
	}

	@PutMapping("/customer/{id}")
	public List<Customer> updateCustomer(@RequestBody Customer customer, @PathVariable int id)
			throws CustomerException {
		return service.updateCustomer(customer, id);
	}

	@GetMapping("/customer/{id}")
	public Customer getCustomerById(@PathVariable int id) throws CustomerException {
		return service.getCustomerById(id);
	}
	
	@GetMapping("/customers/{email}")
	public Customer getByEmail(@PathVariable String email) throws CustomerException {
		return service.getByEmail(email);
	}

	@PostMapping("/register")
	public List<Customer> registerCustomer(@RequestBody Customer customer) throws CustomerException {
		return service.addCustomer(customer);
	}

	@GetMapping("/login/{email}/{password}")
	public Customer login(@PathVariable String email, @PathVariable String password) throws CustomerException {

		return service.login(email, password);
	}

}
