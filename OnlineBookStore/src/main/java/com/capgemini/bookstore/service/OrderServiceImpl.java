package com.capgemini.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bookstore.bean.Category;
import com.capgemini.bookstore.bean.Order;
import com.capgemini.bookstore.bean.OrderBooks;
import com.capgemini.bookstore.dao.OrderRepository;
import com.capgemini.bookstore.exception.BookException;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderDao;

	@Override
	public List<Order> getAllOrders() throws BookException {
		
		return orderDao.findAll();
	}
	    @Override
	    public Order getOrderById(int id) throws BookException {
	        try {
	            Optional<Order> data=orderDao.findById(id);
	            if(data.isPresent()) {
	                return data.get();
	            }
	            else {
	                throw new BookException("User with the id "+id+" doesnot exist");
	}
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            throw new BookException(e.getMessage());
	        }
	    }

	 

	    @Override
	    public Order saveOrder(Order order) throws BookException {
	        orderDao.save(order);
	        return order;
	    }

}
