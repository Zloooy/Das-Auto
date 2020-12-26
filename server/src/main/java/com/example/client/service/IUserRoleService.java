package com.example.client.service;

import com.example.client.model.UserRole;
import org.springframework.stereotype.Service;

@Service
public interface IUserRoleService extends CRUDPageService<UserRole> {
    UserRole getById(long id);
}
