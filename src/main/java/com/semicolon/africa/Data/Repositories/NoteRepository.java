package com.semicolon.africa.Data.Repositories;

import com.semicolon.africa.Data.Models.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<Note, String> {
}
