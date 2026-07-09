package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService() {
        System.out.println("[BookService] Bean created by Spring IoC container.");
    }

    // Setter method — Spring calls this to inject the BookRepository dependency
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("[BookService] BookRepository injected via setter (Dependency Injection).");
    }

    public void addBook(String title) {
        bookRepository.save(title);
    }

    public void findBook(int id) {
        String result = bookRepository.findById(id);
        System.out.println("[BookService] Result -> " + result);
    }
}
