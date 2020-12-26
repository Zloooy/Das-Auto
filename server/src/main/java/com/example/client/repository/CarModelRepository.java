package com.example.client.repository;

import com.example.client.model.CarModel;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarModelRepository extends PagingAndSortingRepository<CarModel, Long> {
}
