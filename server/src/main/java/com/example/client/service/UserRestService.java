package com.example.client.service;

import com.example.client.model.User;
import com.example.client.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserRestService extends CRUDPageRestService<User, UserRepository> implements IUserService{
}
