package com.capgemini.bookstore.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BookStore_Order")
public class Order {
	@Id
	@GeneratedValue
	private int id;
	private String paymentMethod;
	private String status;
	private Date orderDate;
	private String recipientName;
	private String recipientPhone;
	private String shipTo;
	@OneToMany
	private List<OrderBooks> books;
	@ManyToOne
	private Customer customer;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int id, String paymentMethod, String status, Date orderDate, String recipientName,
			String recipientPhone, String shipTo, List<OrderBooks> books, Customer customer) {
		super();
		this.id = id;
		this.paymentMethod = paymentMethod;
		this.status = status;
		this.orderDate = orderDate;
		this.recipientName = recipientName;
		this.recipientPhone = recipientPhone;
		this.shipTo = shipTo;
		this.books = books;
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getRecipientPhone() {
		return recipientPhone;
	}
	public void setRecipientPhone(String recipientPhone) {
		this.recipientPhone = recipientPhone;
	}
	public String getShipTo() {
		return shipTo;
	}
	public void setShipTo(String shipTo) {
		this.shipTo = shipTo;
	}
	public List<OrderBooks> getBooks() {
		return books;
	}
	public void setBooks(List<OrderBooks> books) {
		this.books = books;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", paymentMethod=" + paymentMethod + ", status=" + status + ", orderDate="
				+ orderDate + ", recipientName=" + recipientName + ", recipientPhone=" + recipientPhone + ", shipTo="
				+ shipTo + ", books=" + books + ", customer=" + customer + "]\n";
	}
	
	
	
	
	
}
