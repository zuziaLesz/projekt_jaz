package com.example.controllers;

import com.example.dto.BookDto;
import com.example.model.Book;
import com.example.model.Review;
import com.example.sevice.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/books")
@Controller
public class BookController {
    private final BookService bookService;
    @GetMapping
    public ResponseEntity<List<Book>>getAllBooks(){
        return ResponseEntity.ok(bookService.getAllBooks());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Book>getBookById(@PathVariable Long id){
        return ResponseEntity.ok(bookService.getBookById(id));
    }
    @GetMapping("/{bookId}/reviews")
    public ResponseEntity<List<Review>> getReviewsByBook(@PathVariable Long bookId){
        return ResponseEntity.ok(bookService.getReviewsByBooks(bookId));
    }
    @GetMapping("/{bookId}/averageRating")
    public ResponseEntity<Double> getAverageRatingForBook(@PathVariable Long bookId) {
        return ResponseEntity.ok(bookService.getAvgRating(bookId));
    }
    @PostMapping
    public ResponseEntity<Void> addBook(@RequestBody BookDto bookDto) {
        bookService.addBook(bookDto);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/{userId}/favouriteBook")
    public ResponseEntity<Book> usersBestBook(@PathVariable Long userId) {
        return ResponseEntity.ok(bookService.getHighestRatedBookByUser(userId));
    }
}
