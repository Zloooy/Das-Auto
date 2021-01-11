package com.example.client.controller;

import com.example.client.model.User;
import com.example.client.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController extends CRUDPageController<User, IUserService>{
    @GetMapping("/login/{login}")
    public User getByLogin(@PathVariable(name = "login") String login)
    {
        return crudService.getByLogin(login);
    }
}
