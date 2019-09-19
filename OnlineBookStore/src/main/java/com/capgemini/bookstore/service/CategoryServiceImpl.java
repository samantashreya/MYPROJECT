package com.capgemini.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bookstore.bean.Category;
import com.capgemini.bookstore.dao.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	 	@Autowired
		private CategoryRepository categoryDao;

	/*
	 * @Autowired private LoginDataDao logindao;
	 */
		@Override
		public List<Category> getAllCategories()   {
			System.out.println("sassaas");
			return  categoryDao.findAll();
			
		}
		@Override
		public String addCategory(Category category)   {
			
			categoryDao.save(category);
			
			return "added successfully";
		}
		@Override
		public List<Category> deleteCategory(int id)   {
			// TODO Auto-generated method stub
			categoryDao.deleteById(id);
			// return categoryDao.getAllCategories();
			return null;
		}
		@Override
		public Category getCategory(int id)   {
			Category cg=categoryDao.findById(id).get();
			System.out.println(cg.getCategoryName());
			return cg;
		}
		@Override
		public String updateCategory(int id, Category category)   {
			if(categoryDao.existsById(id)) {
				Category cat=categoryDao.findById(id).get();
				String name=category.getCategoryName();
				System.out.println(name);
				cat.setCategoryName(name);
				categoryDao.save(cat);
			}
			return "updated Successfully";	}
	/*
	 * @Override public LoginData validlogin(String email) { boolean status = false;
	 * if(logindao.existsById(email)){ status=true;
	 * 
	 * }
	 */
			
	/*
	 * return logindao.findById(email).get(); }
	 * 
	 * @Override public boolean addlogin(LoginData login) { // TODO Auto-generated
	 * method stub logindao.save(login); return true; }
	 */

	
}
