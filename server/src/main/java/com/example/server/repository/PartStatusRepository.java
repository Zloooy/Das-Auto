package com.example.server.repository;

import com.example.server.model.PartStatus;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartStatusRepository extends PagingAndSortingRepository<PartStatus, Long> {
}
