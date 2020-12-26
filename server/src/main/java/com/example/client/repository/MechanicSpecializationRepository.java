package com.example.client.repository;

import com.example.client.model.MechanicSpecialization;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechanicSpecializationRepository extends PagingAndSortingRepository<MechanicSpecialization, Long>{
}
