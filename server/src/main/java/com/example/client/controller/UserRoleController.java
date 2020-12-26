package com.example.client.controller;

import com.example.client.model.UserRole;
import com.example.client.service.IUserRoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user_roles")
public class UserRoleController  extends CRUDPageController<UserRole, IUserRoleService>{
}
