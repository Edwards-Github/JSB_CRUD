package com.devtiro.database.controllers;

import com.devtiro.database.domain.dto.AuthorDto;
import com.devtiro.database.services.AuthorService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    public AuthorDto createAuthor(@RequestBody AuthorDto author) {
        return authorService.createAuthor(author);
    }
}
