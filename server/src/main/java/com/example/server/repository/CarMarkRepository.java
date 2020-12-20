package com.example.server.repository;

import com.example.server.model.CarMark;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarMarkRepository extends PagingAndSortingRepository<CarMark, Long> {
}
