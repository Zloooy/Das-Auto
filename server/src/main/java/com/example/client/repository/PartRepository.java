package com.example.client.repository;

import com.example.client.model.Part;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartRepository extends PagingAndSortingRepository<Part, Long> {
}
