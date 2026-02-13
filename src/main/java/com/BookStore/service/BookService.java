package com.BookStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookStore.Entity.Book;
import com.BookStore.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bRepo;
    public void saveBook(Book b) {
        // Logic to save the book to the database
        bRepo.save(b);
    }
}
