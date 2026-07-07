package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter for Spring to inject BookRepository bean
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookTitle) {
        System.out.println("BookService: Adding book -> " + bookTitle);
        bookRepository.save(bookTitle);
    }

    public void getBook(int id) {
        String book = bookRepository.findById(id);
        System.out.println("BookService: Retrieved -> " + book);
    }
}
