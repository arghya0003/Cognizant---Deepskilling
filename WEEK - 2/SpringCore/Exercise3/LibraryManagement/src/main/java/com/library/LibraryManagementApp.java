package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Loading Spring Application Context ===");
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("\n=== Spring IoC Container Ready. Retrieving BookService bean ===");
        BookService bookService = (BookService) context.getBean("bookService");

        System.out.println("\n=== Testing Spring AOP Logging ===");
        bookService.addBook("Effective Java - Joshua Bloch");
        System.out.println();
        bookService.findBook(1);
        System.out.println();
        bookService.findBook(2);

        System.out.println("\n=== AOP logging verified successfully! ===");

        ((ClassPathXmlApplicationContext) context).close();
    }
}
