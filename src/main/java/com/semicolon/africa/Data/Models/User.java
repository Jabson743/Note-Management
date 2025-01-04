package com.semicolon.africa.Data.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
public class User {
    @Id
    private String Id;
    private String lastName;
    private String firstName;
    private String email;
    private String password;
    private String userName;
    @DBRef
    private List<Note> notes;
}
