package com.semicolon.africa.Dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateUserRequest {
    private String lastName;
    private String firstName;
    private String email;
    private String password;
    private String userName;
}
