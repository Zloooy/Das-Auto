package com.example.client.repository;

import com.example.client.model.PartStatus;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartStatusRepository extends PagingAndSortingRepository<PartStatus, Long> {
}
