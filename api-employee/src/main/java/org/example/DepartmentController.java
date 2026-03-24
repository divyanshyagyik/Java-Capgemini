package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentRepository repository;

    @GetMapping("/{id}")
    public Department getById(@PathVariable int id) {
        return repository.findById(id);
    }

    @GetMapping
    public List<Department> getAll() {
        return repository.findAll();
    }
}