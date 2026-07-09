package com.library.repository;

import java.util.HashMap;
import java.util.Map;

public class BookRepository {

    private final Map<Integer, String> bookStore = new HashMap<>();

    public BookRepository() {
        // sample data
        bookStore.put(1, "Clean Code - Robert C. Martin");
        bookStore.put(2, "The Pragmatic Programmer - Andrew Hunt");
        bookStore.put(3, "Design Patterns - Gang of Four");
        System.out.println("[BookRepository] Bean created by Spring IoC container.");
    }

    public void save(String bookTitle) {
        int newId = bookStore.size() + 1;
        bookStore.put(newId, bookTitle);
        System.out.println("[BookRepository] Saved: \"" + bookTitle + "\" with ID " + newId);
    }

    public String findById(int id) {
        String book = bookStore.getOrDefault(id, "Not Found");
        System.out.println("[BookRepository] Fetched ID " + id + ": " + book);
        return book;
    }
}
