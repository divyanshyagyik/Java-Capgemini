package org.example.repository;

import org.example.entity.Cab;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CabRepository extends JpaRepository<Cab, Integer> {
}