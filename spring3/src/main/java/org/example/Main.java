package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        DirectoryService directoryService = context.getBean("directoryService", DirectoryService.class);

        String defaultDir = (String) context.getBean("defaultDirectory");
        directoryService.processDirectory(defaultDir);
    }
}