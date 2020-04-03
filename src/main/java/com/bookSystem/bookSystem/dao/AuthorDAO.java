package com.bookSystem.bookSystem.dao;

import com.bookSystem.bookSystem.entities.Author;
import com.bookSystem.bookSystem.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorDAO {
    private AuthorRepository authorRepository;

    @Autowired
    public AuthorDAO(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author save(Author author) throws Exception {
        try {
            return authorRepository.save(author);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
