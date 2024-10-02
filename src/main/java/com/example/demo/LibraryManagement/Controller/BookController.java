package com.example.demo.LibraryManagement.Controller;


import com.example.demo.LibraryManagement.entity.Book;
import com.example.demo.LibraryManagement.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")    // http://localhost:8080/api/get-all-books
public class BookController {

    @Autowired
    private BookRepository repository;

    @GetMapping("/get-all-books")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = repository.findAll();
        return ResponseEntity.ok(books);
    }

}