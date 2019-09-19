package com.capgemini.bookstore.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BookStore_Review")
public class Review {
	
	@Id
	@GeneratedValue
	private int id;
	private String bookTitle;
	private double rating;
	private String customerName;
	private String headLine;
	private String comments;
	private Date reviewDate;
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Review(int id, String bookTitle, double rating, String customerName, String headLine, String comments,
			Date reviewDate) {
		super();
		this.id = id;
		this.bookTitle = bookTitle;
		this.rating = rating;
		this.customerName = customerName;
		this.headLine = headLine;
		this.comments = comments;
		this.reviewDate = reviewDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getHeadLine() {
		return headLine;
	}
	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}
	@Override
	public String toString() {
		return "Review [id=" + id + ", bookTitle=" + bookTitle + ", rating=" + rating + ", customerName=" + customerName
				+ ", headLine=" + headLine + ", comments=" + comments + ", reviewDate=" + reviewDate + "]\n";
	}
	
	
	
	
}
