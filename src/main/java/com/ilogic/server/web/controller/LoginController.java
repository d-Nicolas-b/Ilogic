package com.ilogic.server.web.controller;

import com.ilogic.server.domain.dto.UserLoginRequest;
import com.ilogic.server.persistence.crud.UserCrudRepository;
import com.ilogic.server.persistence.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private UserCrudRepository userRepository;
    @PostMapping("/login")
    public String login(@RequestBody UserLoginRequest userLoginRequest) {
        String username = userLoginRequest.getUsername();
        String password = userLoginRequest.getPassword();

        User user = userRepository.findByUsernameAndPassword(username, password);

        if (user != null && user.getPassword().equals(password)) {
            return "Login successful";
        } else {
            return "Invalid username or password";
        }
    }
}
