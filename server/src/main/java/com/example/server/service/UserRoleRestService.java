package com.example.server.service;

import com.example.server.model.UserRole;
import com.example.server.repository.UserRoleRepository;
import org.springframework.stereotype.Service;

@Service
public class UserRoleRestService extends CRUDPageRestService<UserRole, UserRoleRepository> implements IUserRoleService{
}
