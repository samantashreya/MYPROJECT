package com.capgemini.bookstore.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BookStore_OrderBooks")
public class OrderBooks {
	@Id
	private int id;
	@ManyToOne
	private Book book;
	private Integer quantity;
	public OrderBooks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderBooks(int id, Book book, Integer quantity) {
		super();
		this.id = id;
		this.book = book;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "OrderBooks [id=" + id + ", book=" + book + ", quantity=" + quantity + "]\n";
	}
	
	
	
	
}
