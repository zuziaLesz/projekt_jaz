package com.example.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Setter
@Getter
@Controller
public class BookDto {
    private Long id;
    private String title;
    private String author;
}
