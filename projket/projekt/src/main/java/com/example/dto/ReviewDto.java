package com.example.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Setter
@Getter
public class ReviewDto {
    private Long id;
    private String comment;
    @JsonProperty("book_id")
    private Long bookId;
    @JsonProperty("user_id")
    private Long userId;
    private Long Rating;

}
