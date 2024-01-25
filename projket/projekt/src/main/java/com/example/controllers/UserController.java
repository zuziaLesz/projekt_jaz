package com.example.controllers;

import com.example.dto.UserDto;
import com.example.model.Review;
import com.example.model.User;
import com.example.sevice.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Vector;

@RequiredArgsConstructor
@RequestMapping("/api/users")
@Controller
public class UserController {
    private final UserService userService;
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }
    @GetMapping("/{userId}/reviews")
    public ResponseEntity<List<Review>> getUserReviews(@PathVariable Long userId) {
        return ResponseEntity.ok(userService.getUserReviews(userId));
    }
    @PostMapping
    public ResponseEntity<Void> addUser(@RequestBody UserDto userDto) {
        userService.addUser(userDto);
        return ResponseEntity.ok().build();
    }
}
