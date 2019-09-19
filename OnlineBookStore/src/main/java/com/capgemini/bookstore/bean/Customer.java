package com.capgemini.bookstore.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BookStore_Customer")
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	@Column(unique = true)
	private String email;
	private String fullName;
	private String password;
	private String phoneNumber;
	private String address;
	private String city;
	private String country;
	private String zipcode;
	private Date registeredDate;

	/*
	 * @OneToMany private List<Order> orders;
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Date getRegisterDate() {
		return registeredDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registeredDate = registerDate;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String email, String fullName, String password, String phoneNumber, String address,
			String city, String country, String zipcode, Date registerDate) {
		super();
		this.id = id;
		this.email = email;
		this.fullName = fullName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
		this.registeredDate = registerDate;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", fullName=" + fullName + ", password=" + password
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", city=" + city + ", country=" + country
				+ ", zipcode=" + zipcode + ", registeredDate=" + registeredDate + "]";
	}
}
