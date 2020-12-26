package com.example.client.repository;

import com.example.client.model.PartType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartTypeRepository extends PagingAndSortingRepository<PartType, Long> {
}
