package com.example.client.repository;

import com.example.client.model.Applicability;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicabilityRepository extends PagingAndSortingRepository<Applicability, Long> {
}
