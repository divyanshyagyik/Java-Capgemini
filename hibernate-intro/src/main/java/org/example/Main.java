package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    static SessionFactory factory;

    public static void main(String[] args) {

        factory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        saveStudent(1, "Rahul", 22);
        getStudent(1);

        factory.close();
    }
    public static void saveStudent(int id, String name, int age) {

        Session session = factory.openSession();
        session.beginTransaction();

        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setAge(age);

        session.persist(s);

        session.getTransaction().commit();
        session.close();

        System.out.println("Student saved");
    }
    public static void getStudent(int id) {

        Session session = factory.openSession();
        Student s = session.get(Student.class, id);

        if (s != null) {
            System.out.println("Student found: " + s.getName() + " Age: " + s.getAge() + "ID: " + s.getId());
        } else {
            System.out.println("Student not found");
        }

        session.close();
    }
}