package com.example.client.repository;

import com.example.client.model.WorkType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkTypeRepository extends PagingAndSortingRepository<WorkType, Long> {
}
