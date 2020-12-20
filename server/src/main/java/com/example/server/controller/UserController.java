package com.example.server.controller;

import com.example.server.model.User;
import com.example.server.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController extends CRUDPageController<User, IUserService>{
}
