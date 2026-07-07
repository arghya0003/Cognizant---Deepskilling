package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApp {

    public static void main(String[] args) {
        // Load Spring application context from XML configuration
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Test the configuration
        bookService.addBook("Clean Code");
        bookService.addBook("The Pragmatic Programmer");
        bookService.getBook(1);

        System.out.println("Spring context loaded and configured successfully!");

        // Close the context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
