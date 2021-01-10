package com.example.client.repository;

import com.example.client.model.UserRole;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends PagingAndSortingRepository<UserRole, Long> {
    public UserRole findUserRolesByName(String name);
}
