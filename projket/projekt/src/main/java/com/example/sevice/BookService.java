package com.example.sevice;

import com.example.dto.BookDto;
import com.example.exceptions.BookNotFoundException;
import com.example.exceptions.ReviewNotFoundException;
import com.example.mapper.BookMapper;
import com.example.model.Book;
import com.example.model.Review;
import com.example.repository.BookRepository;
import com.example.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;
    private final ReviewRepository reviewRepository;
    public List<Book> getAllBooks() {return bookRepository.findAll();}
    public Book getBookById(Long id) {
       return bookRepository.findById(id).orElseThrow(BookNotFoundException::new);
    }
    public void addBook(BookDto bookDto) {
        Book book = bookMapper.mapToEntity(bookDto);
        bookRepository.save(book);
    }
    public List<Review> getReviewsByBooks(Long bookId) {
        Book book = getBookById(bookId);
        return book.getReviews();
    }
    public Double getAvgRating(Long id){
        Book book = bookRepository.findById(id).orElseThrow(BookNotFoundException::new);
        return book.getReviews().stream().mapToDouble(Review::getRating).average().orElse(0.0);
    }
    public Book getHighestRatedBookByUser(Long userId) {
        Optional<Review> highestReview = reviewRepository.findAll().stream().filter(review -> review.getUser().getId() == userId)
                .sorted(Comparator.comparingLong(Review::getRating).reversed())
                .findFirst();
        if(highestReview.isPresent()) {
            return highestReview.get().getBook();
        }
        else throw new ReviewNotFoundException();
    }
}
