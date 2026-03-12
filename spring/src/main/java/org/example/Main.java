package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MyBeansConfig.class);
        context.scan("org.example");
        context.refresh();

        PasswordHasher bean = context.getBean(PasswordHasher.class);
        System.out.println(bean);
        System.out.println(bean.hash("Hello"));

        StringBuilder bean3 = context.getBean(StringBuilder.class);
        System.out.println(bean3);

        Calc calc = context.getBean(Calc.class);
        System.out.println(calc.add(5,5));

        Calc calc2 = (Calc) context.getBean(Calc.class);
        System.out.println(calc2.add(3,3));
        context.close();
    }

}