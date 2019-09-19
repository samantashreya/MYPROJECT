package com.capgemini.bookstore.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BookStore_Category")
public class Category {
	@Id
	@GeneratedValue
	private int id;
	private String categoryName;
	public Category(int id, String categoryName) {
		super();
		this.id = id;
		this.categoryName = categoryName;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", categoryName=" + categoryName + "]\n";
	}
	
	
	
	
}
