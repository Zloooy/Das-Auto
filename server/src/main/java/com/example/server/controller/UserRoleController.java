package com.example.server.controller;

import com.example.server.model.UserRole;
import com.example.server.service.IUserRoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user_roles")
public class UserRoleController  extends CRUDPageController<UserRole, IUserRoleService>{
}
