package org.example;


import org.example.Employee;
import org.example.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public Employee getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<Employee> searchByName(String name) {
        return repo.findByNameContainingIgnoreCase(name);
    }

    public Employee save(Employee emp) {
        return repo.save(emp);
    }
}
