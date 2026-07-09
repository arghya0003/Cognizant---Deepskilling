package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Loading Spring Application Context ===");
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("LibraryManagement Maven project configured successfully.");
        System.out.println("Spring Context, Spring AOP, and Spring WebMVC dependencies are on the classpath.");

        ((ClassPathXmlApplicationContext) context).close();
    }
}
