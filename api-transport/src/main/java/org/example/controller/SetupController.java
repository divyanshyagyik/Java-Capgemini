package org.example.controller;

import org.example.entity.Cab;
import org.example.entity.Employee;
import org.example.repository.CabRepository;
import org.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SetupController {

    @Autowired
    private EmployeeRepository empRepo;

    @Autowired
    private CabRepository cabRepo;

    @GetMapping("/test")
    public String test() {
        return "working";
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee e) {
        return empRepo.save(e);
    }

    @GetMapping("/employee")
    public List<Employee> getEmployee(){
        return (List<Employee>) empRepo.findAll();
    }

    @PostMapping("/cab")
    public Cab createCab(@RequestBody Cab c) {
        return cabRepo.save(c);
    }

    @GetMapping("/cab")
    public List<Cab> getCab(){
        return (List<Cab>) cabRepo.findAll();
    }
}