package com.example.server.service;

import com.example.server.model.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService extends IdService<User>, CRUDPageService<User> {
}
