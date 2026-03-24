package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("org.example");
        context.refresh();
        UserVerifier userVerifier = context.getBean(UserVerifier.class);
        userVerifier.verifyUser();
        context.close();

    }
}