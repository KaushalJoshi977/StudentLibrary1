package com.example.StudentLib.controller;

import com.example.StudentLib.DTO.BookDTO;
import com.example.StudentLib.Modals.AuthorEntity;
import com.example.StudentLib.Modals.BookEntity;
import com.example.StudentLib.repositories.BookRepo;
import com.example.StudentLib.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BooksController {

    @Autowired
    BookService bookService;
    @Autowired
    BookRepo bookRepo;

    @PostMapping("/add")
    public String addBook(@RequestBody BookDTO book){
        return bookService.addBook(book);
    }
    @PostMapping("/addAuthor")
    public AuthorEntity addAuthor(@RequestBody AuthorEntity author){
        return bookService.addAuthor(author);
    }
    @GetMapping("/get/{id}")
    public BookEntity getBook(@PathVariable int id){
        return bookRepo.findById(id).get();
    }


}
