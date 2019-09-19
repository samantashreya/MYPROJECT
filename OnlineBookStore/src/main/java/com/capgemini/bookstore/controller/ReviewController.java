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

import com.capgemini.bookstore.bean.Review;
import com.capgemini.bookstore.exception.ReviewException;
import com.capgemini.bookstore.service.ReviewService;
import com.capgemini.bookstore.service.ReviewServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ReviewController {

	@Autowired
	ReviewService reviewService;

	
	@GetMapping("/reviews")
	public List<Review> getAllReviews() throws ReviewException  {
		return reviewService.getAllReviews();
	}
	
	@PostMapping("/reviews")
	public List<Review> addReview(@RequestBody Review review)   throws ReviewException{
		return reviewService.addReview(review);
	}
	
	@DeleteMapping("/reviews/{Id}")
	public List<Review> deleteReview(@PathVariable int Id)  throws ReviewException {
			return reviewService.deleteReview(Id);
	
	}
	
	@PutMapping("/reviews/{Id}")
	public List<Review> editReview(@PathVariable int Id,@RequestBody Review review) throws ReviewException  {
		return reviewService.editReview(Id,review);
	}
	
	@GetMapping("/reviews/{Id}")
	public Review getReviewById(@PathVariable int Id )  throws ReviewException{
		return reviewService.getReviewById(Id);
	}
}
