package com.example.client.repository;

import com.example.client.model.PartModel;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartModelRepository extends PagingAndSortingRepository<PartModel, Long> {
}
