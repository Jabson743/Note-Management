package com.semicolon.africa.Services;

import com.semicolon.africa.Dto.CreateUserRequest;
import com.semicolon.africa.Dto.CreateUserResponse;

public interface UserService {
    CreateUserResponse registerUser(CreateUserRequest createUserRequest);
}
