package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeService.find(id);
    }

    @GetMapping
    public Employee getByEmployeeId(@RequestParam int id) {
        return employeeService.find(id);
    }

    @GetMapping("/byname")
    public Employee getByEmployeeName(@RequestParam String name) {
        return employeeService.findByName(name);
    }
}