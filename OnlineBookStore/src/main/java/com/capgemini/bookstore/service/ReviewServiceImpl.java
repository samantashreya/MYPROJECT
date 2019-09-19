package com.capgemini.bookstore.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bookstore.bean.Review;
import com.capgemini.bookstore.dao.ReviewRepository;
import com.capgemini.bookstore.exception.ReviewException;

@Service
public class ReviewServiceImpl implements ReviewService{
	@Autowired
	ReviewRepository reviewDao;
	
	@Override
	public List<Review> getAllReviews()  throws ReviewException   {
		return reviewDao.findAll();
	}

	@Override
	public List<Review> addReview(Review review)  throws ReviewException {
		long sec=System.currentTimeMillis();
	    Date date=new Date(sec);
	    reviewDao.save(review);
		return getAllReviews();
	}

	@Override
	public List<Review> deleteReview(int Id)   throws ReviewException  {
		reviewDao.deleteById(Id);
		return getAllReviews();
	}

	@Override
	public List<Review> editReview(int Id, Review review) throws ReviewException   {
	
	
		int id=review.getId();
		if(reviewDao.existsById(id)) {
			reviewDao.save(review);
			return getAllReviews();
		}
		
	
else {
		throw new ReviewException("Cannot Update Review with Id"+id+"doesnt exists");
	}
	}

	@Override
	public Review getReviewById(int Id)  throws ReviewException   {

		try {
			Optional<Review>data=reviewDao.findById(Id);
			if(data.isPresent()) {
				return data.get();
			}
			else {
				throw new ReviewException("Review with Id"+Id+"does not exists");
			}
		}catch(Exception e) {
			throw new ReviewException(e.getMessage());
		}
		
	}

}
