package com.example.client.service;

import com.example.client.model.UserRole;
import com.example.client.repository.UserRoleRepository;
import org.springframework.stereotype.Service;

@Service
public class UserRoleRestService extends CRUDPageRestService<UserRole, UserRoleRepository> implements IUserRoleService{
}
