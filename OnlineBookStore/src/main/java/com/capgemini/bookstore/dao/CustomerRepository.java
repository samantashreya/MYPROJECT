package com.capgemini.bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.bookstore.bean.Customer;




@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{
	@Query("from Customer where email=:email")
Customer getByEmail(@Param("email") String email);

}
