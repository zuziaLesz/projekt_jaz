package com.example.exceptions;

public class InvalidRatingException extends RuntimeException{
    public InvalidRatingException(){
        super("Invalid Rating");
    }
}
