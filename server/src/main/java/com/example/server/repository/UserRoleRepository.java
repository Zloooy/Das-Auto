package com.example.server.repository;

import com.example.server.model.UserRole;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends PagingAndSortingRepository<UserRole, Long> {
}
