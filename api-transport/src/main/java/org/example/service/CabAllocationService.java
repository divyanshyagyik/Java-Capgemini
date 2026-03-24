package org.example.service;
import org.example.entity.Cab;
import org.example.entity.CabAllocation;
import org.example.repository.CabAllocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class CabAllocationService {

    @Autowired
    private CabAllocationRepository repo;

    public List<CabAllocation> getAll() {
        return repo.findAll();
    }

    public CabAllocation assign(CabAllocation allocation) {
        return repo.save(allocation);
    }
    public Cab getCab(int empId, LocalDate date) {
        return repo.findByEmployeeIdAndAllocationDate(empId, date)
                .map(CabAllocation::getCab)
                .orElse(null);
    }
}