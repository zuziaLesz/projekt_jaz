package com.example.exceptions;

public class ReviewNotFoundException extends RuntimeException{
    public ReviewNotFoundException(){
        super("Review not found");
    }
}
