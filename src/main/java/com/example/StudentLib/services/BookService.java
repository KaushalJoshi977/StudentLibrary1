package com.example.StudentLib.services;

import com.example.StudentLib.DTO.BookDTO;
import com.example.StudentLib.Modals.AuthorEntity;
import com.example.StudentLib.Modals.BookEntity;
import com.example.StudentLib.repositories.AuthorRepo;
import com.example.StudentLib.repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;

    @Autowired
    AuthorRepo authorRepo;
    public String addBook(BookDTO bookDto) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setName(bookDto.getName());
        bookEntity.setGenre(bookDto.getGenre());
        bookEntity.setPages(bookDto.getPages());
        AuthorEntity author = authorRepo.findById(bookDto.getAuthorId()).get();
        bookEntity.setAuthor(author);
        List<BookEntity> bookList = new ArrayList<>();
        bookList.add(bookEntity);
        author.setBookList(bookList);
        authorRepo.save(author);
        return "book saved";
    }

    public AuthorEntity addAuthor(AuthorEntity author) {
       return authorRepo.save(author);
    }
}
