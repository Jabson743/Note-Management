package com.semicolon.africa.Services;

import com.semicolon.africa.Data.Models.User;
import com.semicolon.africa.Data.Repositories.UserRepository;
import com.semicolon.africa.Dto.CreateUserRequest;
import com.semicolon.africa.Dto.CreateUserResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

@Override
public CreateUserResponse registerUser(CreateUserRequest createUserRequest) {
    Optional<User> existingUser = userRepository.findByUserName(createUserRequest.getUserName());

    if (existingUser.isPresent()) {
        throw new RuntimeException("User already exists");
    }
    User newUser = new User();
    newUser.setUserName(createUserRequest.getUserName());
    newUser.setFirstName(createUserRequest.getFirstName());
    newUser.setLastName(createUserRequest.getLastName());
    newUser.setPassword(createUserRequest.getPassword());
    newUser.setEmail(createUserRequest.getEmail());

    userRepository.save(newUser);

    CreateUserResponse response = new CreateUserResponse();
    response.setMessage("registered successfully");
    return response;
}
}
