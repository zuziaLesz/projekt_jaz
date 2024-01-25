package com.example.sevice;

import com.example.dto.ReviewDto;
import com.example.exceptions.ReviewNotFoundException;
import com.example.mapper.ReviewMapper;
import com.example.model.Review;
import com.example.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewMapper mapper;
    private final ReviewRepository reviewRepository;
    public void leaveReview(ReviewDto reviewDto) {
        Review review = mapper.mapToEntity(reviewDto);
        if(review.getRating()>5) review.setRating(Long.valueOf(5));
        if(review.getRating()<1) review.setRating(Long.valueOf(1));
    }
    public void editReview(ReviewDto reviewDto, Long id){
        reviewRepository.delete(reviewRepository.findById(id).orElseThrow(ReviewNotFoundException::new));
        reviewRepository.save(mapper.mapToEntity(reviewDto));
    }
    public void deleteReview(Long id){
        reviewRepository.delete(reviewRepository.findById(id).orElseThrow(ReviewNotFoundException::new));
    }
    Long getRating(Long id){
        return reviewRepository.findById(id).orElseThrow(ReviewNotFoundException::new).getRating();
    }
}
