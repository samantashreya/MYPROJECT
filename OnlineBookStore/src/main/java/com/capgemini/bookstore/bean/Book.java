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
@Table(name= "BookStore_Book")
public class Book {
	@Id
	@GeneratedValue
	private int id;
	@ManyToOne
	private Category category;
	private String title;
	private String author;
	private String isbn;
	private Date purchaseDate;
	private String bookImage;
	private String description;
	private double price;
	
	@OneToMany
	private List<Review> reviews;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, Category category, String title, String author, String isbn, Date purchaseDate,
			String bookImage, String description, double price, List<Review> reviews) {
		super();
		this.id = id;
		this.category = category;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.purchaseDate = purchaseDate;
		this.bookImage = bookImage;
		this.description = description;
		this.price = price;
		this.reviews = reviews;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getBookImage() {
		return bookImage;
	}

	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", category=" + category + ", title=" + title + ", author=" + author + ", isbn="
				+ isbn + ", purchaseDate=" + purchaseDate + ", bookImage=" + bookImage + ", description=" + description
				+ ", price=" + price + ", reviews=" + reviews + "]\n";
	}

	
	
}
