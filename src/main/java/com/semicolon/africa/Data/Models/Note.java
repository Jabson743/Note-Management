package com.semicolon.africa.Data.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Getter
@Setter
public class Note {
    @Id
    private String id;
    private String title;
    private String content;
    private LocalDateTime createdAt;

}
