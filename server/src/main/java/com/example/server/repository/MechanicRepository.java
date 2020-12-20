package com.example.server.repository;

import com.example.server.model.Mechanic;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechanicRepository extends PagingAndSortingRepository<Mechanic, Long> {
}
