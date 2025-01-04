package com.semicolon.africa.Services;

import com.semicolon.africa.Dto.CreateUserRequest;
import com.semicolon.africa.Dto.CreateUserResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void testThatUserCanBeCreated(){
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setUserName("ola5-0");
        createUserRequest.setFirstName("olamide");
        createUserRequest.setLastName("olakunle");
        createUserRequest.setPassword("123456");
        createUserRequest.setEmail("chibby@gmail.com");

        CreateUserResponse response = userService.registerUser(createUserRequest);
        assertEquals("registered successfully", response.getMessage());
    }

    @Test
    public void testThatUserWithSameUserNameCannotBeCreated(){
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setUserName("ola5-0");
        createUserRequest.setFirstName("olamide");
        createUserRequest.setLastName("olakunle");
        createUserRequest.setPassword("123456");
        createUserRequest.setEmail("chibby@gmail.com");

        CreateUserResponse response = userService.registerUser(createUserRequest);
        assertThrows(RuntimeException.class, () -> userService.registerUser(createUserRequest));
    }

}
