package com.example.client.service;

import com.example.client.model.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService extends IdService<User>, CRUDPageService<User> {
    User getByLogin(String login);
}
