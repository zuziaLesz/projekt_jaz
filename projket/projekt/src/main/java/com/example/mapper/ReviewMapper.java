package com.example.mapper;

import com.example.dto.ReviewDto;
import com.example.model.Review;
import org.springframework.stereotype.Component;

@Component
public class ReviewMapper implements IMapEntities<ReviewDto, Review> {
    public Review mapToEntity(ReviewDto reviewDto){
        Review review = new Review();
        review.setId(reviewDto.getId());
        review.setComment(reviewDto.getComment());
        review.setRating(review.getRating());
        review.setBook(review.getBook());
        review.setUser(review.getUser());
        return review;
    }
    public ReviewDto mapToDto(Review review) {
        ReviewDto reviewDto = new ReviewDto();
        reviewDto.setId(review.getId());
        reviewDto.setComment(review.getComment());
        reviewDto.setRating(review.getRating());
        reviewDto.setBookId(review.getBook().getId());
        reviewDto.setUserId(review.getUser().getId());
        return reviewDto;
    }
}
