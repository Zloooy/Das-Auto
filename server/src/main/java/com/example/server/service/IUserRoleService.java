package com.example.server.service;

import com.example.server.model.UserRole;
import org.springframework.stereotype.Service;

@Service
public interface IUserRoleService extends CRUDPageService<UserRole> {
    UserRole getById(long id);
}
