package org.example;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EmployeeRepository {

    private final Map<Integer, Employee> db = new HashMap<>();

    public EmployeeRepository() {
        db.put(1, new Employee(1, "Alice", "IT"));
        db.put(2, new Employee(2, "Bob", "HR"));
    }

    public Employee findById(int id) {
        return db.get(id);
    }

    public Employee findByName(String name) {
        return db.values()
                .stream()
                .filter(e -> e.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}