package com.capgemini.bookstore.service;

import java.util.List;

import com.capgemini.bookstore.bean.Category;
import com.capgemini.bookstore.bean.Order;
import com.capgemini.bookstore.bean.OrderBooks;
import com.capgemini.bookstore.exception.BookException;

public interface OrderService {

	List<Order> getAllOrders() throws BookException;

	Order getOrderById(int id) throws BookException;

	Order saveOrder(Order order) throws BookException;

	
	
}
