package com.example.client.repository;

import com.example.client.model.Mechanic;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechanicRepository extends PagingAndSortingRepository<Mechanic, Long> {
}
