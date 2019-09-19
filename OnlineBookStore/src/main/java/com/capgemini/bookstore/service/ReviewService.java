package com.capgemini.bookstore.service;

import java.util.List;

import com.capgemini.bookstore.bean.Review;
import com.capgemini.bookstore.exception.ReviewException;

public interface ReviewService {

	

	List<Review> getAllReviews()   throws ReviewException ;
	List<Review> addReview(Review review)   throws ReviewException ;
	List<Review> deleteReview(int Id)   throws ReviewException ;
	List<Review> editReview(int Id,Review review)   throws ReviewException;
	public Review getReviewById(int Id)   throws ReviewException;
}
