package com.example.sevice;

import com.example.dto.UserDto;
import com.example.exceptions.ReviewNotFoundException;
import com.example.exceptions.UserNotFoundException;
import com.example.mapper.ReviewMapper;
import com.example.mapper.UserMapper;
import com.example.model.Book;
import com.example.model.Review;
import com.example.model.User;
import com.example.repository.ReviewRepository;
import com.example.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserMapper mapper;
    private final ReviewMapper reviewMapper;
    private final ReviewRepository reviewRepository;
    private final UserRepository userRepository;
    public void addUser(UserDto userDto){
        userRepository.save(mapper.mapToEntity(userDto));
    }
    public User getUserById(Long id){ return userRepository.findById(id).orElseThrow(UserNotFoundException::new);}
    public List<Review> getUserReviews(Long userId){
        User user = userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
        return user.getReviews().stream().toList();
    }
}
