package org.example.controller;
import org.example.entity.Cab;
import org.example.entity.CabAllocation;
import org.example.service.CabAllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CabAllocationController {

    @Autowired
    private CabAllocationService service;

    @PostMapping("/cab/assign")
    public CabAllocation assign(@RequestBody CabAllocation allocation) {
        return service.assign(allocation);
    }

    @GetMapping("/cab/assign")
    public List<CabAllocation> getAllAssignments() {
        return service.getAll();
    }

    @GetMapping("/cab/byId")
    public Cab getCabById(@RequestParam int empId,
                      @RequestParam String date) {

        return service.getCab(
                empId,
                LocalDate.parse(date)
        );
    }
}