package com.example.client.repository;

import com.example.client.model.CarMark;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarMarkRepository extends PagingAndSortingRepository<CarMark, Long> {
}
