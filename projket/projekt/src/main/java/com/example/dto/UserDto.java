package com.example.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@RequiredArgsConstructor
@Setter
@Getter
public class UserDto {
    private Long id;
    @JsonProperty("user_name")
    private String userName;
    private String password;
    private List<Long> reviewsId;
}
