package com.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;
    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    private Long rating;
}
