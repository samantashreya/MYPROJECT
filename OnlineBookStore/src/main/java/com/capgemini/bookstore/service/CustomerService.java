package com.capgemini.bookstore.service;

import java.util.List;

import com.capgemini.bookstore.bean.Customer;
import com.capgemini.bookstore.exception.CustomerException;


public interface CustomerService {
	
	List<Customer> getAllCustomers() throws CustomerException;
    List<Customer> addCustomer(Customer customer) throws CustomerException;
   Customer getCustomerById(int id) throws CustomerException;
    List<Customer> deleteCustomer(int id)throws CustomerException;
	List<Customer> updateCustomer(Customer customer, int id) throws CustomerException;
	Customer login(String email, String password) throws CustomerException;
	Customer getByEmail(String email) throws CustomerException;
	
	
}
