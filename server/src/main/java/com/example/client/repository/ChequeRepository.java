package com.example.client.repository;

import com.example.client.model.Cheque;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChequeRepository extends PagingAndSortingRepository<Cheque, Long> {
}
