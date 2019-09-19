package com.capgemini.bookstore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.bookstore.bean.Order;
import com.capgemini.bookstore.service.OrderService;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
	
}
