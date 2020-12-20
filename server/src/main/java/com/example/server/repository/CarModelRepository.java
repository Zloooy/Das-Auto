package com.example.server.repository;

import com.example.server.model.CarModel;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarModelRepository extends PagingAndSortingRepository<CarModel, Long> {
}
