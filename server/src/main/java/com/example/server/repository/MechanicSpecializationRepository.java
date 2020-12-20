package com.example.server.repository;

import com.example.server.model.MechanicSpecialization;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechanicSpecializationRepository extends PagingAndSortingRepository<MechanicSpecialization, Long>{
}
