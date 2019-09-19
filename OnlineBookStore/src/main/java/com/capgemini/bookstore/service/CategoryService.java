package com.capgemini.bookstore.service;

import java.util.List;

import com.capgemini.bookstore.bean.Category;

public interface CategoryService {

	
	

	List<Category> getAllCategories() ;

	String addCategory(Category category) ;

	List<Category> deleteCategory(int id) ;

	Category getCategory(int id) ;

	String updateCategory(int id, Category category) ;

	//LoginData validlogin(String email) ;

	//boolean addlogin(LoginData login) ;
}
