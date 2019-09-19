package com.capgemini.bookstore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.bookstore.bean.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

	

}
