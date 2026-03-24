package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee find(int id) {
        return repository.findById(id);
    }

    public Employee findByName(String name) {
        return repository.findByName(name);
    }
}