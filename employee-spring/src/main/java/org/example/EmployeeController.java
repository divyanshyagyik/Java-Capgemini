package org.example;

import org.example.Employee;
import org.example.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    // Get all employees
    @GetMapping
    public List<Employee> getAll() {
        return service.getAllEmployees();
    }

    // Search by ID
    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // Search by name
    @GetMapping("/search")
    public List<Employee> searchByName(@RequestParam String name) {
        return service.searchByName(name);
    }

    // Add employee (for testing)
    @PostMapping
    public Employee addEmployee(@RequestBody Employee emp) {
        return service.save(emp);
    }
}
