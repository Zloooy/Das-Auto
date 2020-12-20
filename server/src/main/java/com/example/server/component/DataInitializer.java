package com.example.server.component;

import com.example.server.model.User;
import com.example.server.model.UserRole;
import com.example.server.repository.UserRepository;
import com.example.server.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Component
public class DataInitializer implements ApplicationRunner {

    @Autowired
    private UserRoleRepository userRoleRepository;
    @Autowired
    private UserRepository userRepository;

    private static final List<String> userRoles = Arrays.asList("ADMIN");
    @Override
    public void run(ApplicationArguments args) throws Exception {
        createRoles();
        createAdmin();
    }
    private void createRoles()
    {
        AtomicLong i = new AtomicLong(1);
        userRoleRepository.saveAll(userRoles.stream().map((roleName)->new UserRole(i.getAndIncrement(),roleName)).collect(Collectors.toList()));
    }
    private void createAdmin()
    {
        userRepository.save(new User(1, "admin","1234", userRoleRepository.findById(1L).orElse(null)));
    }
}
