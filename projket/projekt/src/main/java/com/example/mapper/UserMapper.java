package com.example.mapper;

import com.example.dto.UserDto;
import com.example.model.Review;
import com.example.model.User;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class UserMapper implements IMapEntities<UserDto, User> {
    public User mapToEntity(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setUserName(userDto.getUserName());
        user.setPassword(userDto.getPassword());
        return user;
    }
    public UserDto mapToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUserName(user.getUserName());
        userDto.setPassword(user.getPassword());
        userDto.setReviewsId(user.getReviews().stream().map(Review::getId).collect(Collectors.toList()));
        return userDto;
    }
}
