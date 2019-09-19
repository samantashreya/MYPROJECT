package com.capgemini.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bookstore.bean.Category;
import com.capgemini.bookstore.bean.Order;
import com.capgemini.bookstore.bean.OrderBooks;
import com.capgemini.bookstore.exception.BookException;
import com.capgemini.bookstore.service.CategoryService;
import com.capgemini.bookstore.service.OrderService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/orders/allOrders")
	public List<Order> getAllOrders() throws BookException {
		System.out.println("asa");
		return orderService.getAllOrders();
	}
	
	/*
	 * @GetMapping("/allOrderedBook") public List<OrderBooks> getAllOrderedBook()
	 * throws BookException { return orderService.getAllOrderedBooks(); }
	 */
    @GetMapping("/orders/order/{id}")
    public Order geOrderById(@PathVariable int id) throws BookException {
    	System.out.println("sasa");
        return orderService.getOrderById(id);
    }
}
