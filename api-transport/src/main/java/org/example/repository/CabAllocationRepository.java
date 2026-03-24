package org.example.repository;

import org.example.entity.CabAllocation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface CabAllocationRepository
        extends JpaRepository<CabAllocation, Integer> {

    Optional<CabAllocation> findByEmployeeIdAndAllocationDate(
            int employeeId,
            LocalDate allocationDate
    );
}