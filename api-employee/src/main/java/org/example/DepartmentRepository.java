package org.example;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class DepartmentRepository {

    private final Map<Integer, Department> db = new HashMap<>();

    public DepartmentRepository() {
        db.put(1, new Department(1, "HR", 208, "2026-03-21"));
    }

    public Department findById(int id) {
        return db.get(id);
    }

    public List<Department> findAll() {
        return new ArrayList<>(db.values());
    }
}