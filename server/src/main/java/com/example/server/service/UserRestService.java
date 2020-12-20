package com.example.server.service;

import com.example.server.model.User;
import com.example.server.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserRestService extends CRUDPageRestService<User, UserRepository> implements IUserService{
}
