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
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bookstore.bean.Category;
import com.capgemini.bookstore.service.CategoryService;

@CrossOrigin("http://localhost:4200")
//@CrossOrigin("*")
@RestController
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@GetMapping("/category/allCategories")
	public List<Category> getAllCategories() {
		System.out.println("asa");
		return categoryService.getAllCategories();
	}

	@PostMapping("/category/addCategory")
	public String addCategory(@RequestBody Category category) {
		return categoryService.addCategory(category);
	}

	@DeleteMapping("/category/deleteCategory/{id}")
	public List<Category> deleteCategory(@PathVariable int id) {
		return categoryService.deleteCategory(id);
	}

	@GetMapping("/category/getCategory/{id}")
	public Category getCategory(@PathVariable int id) {
		return categoryService.getCategory(id);
	}

	@PutMapping("/category/updateCategory/{id}")
	public String updateCategory(@PathVariable int id, @RequestBody Category category) {
		return categoryService.updateCategory(id, category);
	}

	/*
	 * @ExceptionHandler(BookException.class) public ResponseEntity<String>
	 * handleException(Exception ex){ return new
	 * ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
	 * 
	 * }
	 */
	/*
	 * @GetMapping("/login/{email}") public LoginData validateLogin(@PathVariable
	 * String email) throws BookException { return
	 * categoryService.validlogin(email); }
	 */
	/*
	 * @PostMapping("/login") public boolean addlogin(@RequestBody LoginData login)
	 * throws BookException{ return categoryService.addlogin(login); }
	 */

}
