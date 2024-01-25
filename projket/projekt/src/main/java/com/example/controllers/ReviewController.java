package com.example.controllers;

import com.example.dto.ReviewDto;
import com.example.sevice.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/api/reviews")
@Controller
public class ReviewController {
    private final ReviewService reviewService;
    @PostMapping
    public ResponseEntity<Void> leaveReview(@RequestBody ReviewDto reviewDto) {
        reviewService.leaveReview(reviewDto);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Void> editReview(@RequestBody ReviewDto reviewDto, @PathVariable Long id) {
        reviewService.editReview(reviewDto, id);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
        return ResponseEntity.ok().build();
    }

}
