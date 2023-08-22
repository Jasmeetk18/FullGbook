package com.signup.form.controller;

import com.signup.form.model.User;
import com.signup.form.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/login")
    public Optional<User> loginUser(@RequestBody User user) {
        Optional<User> loggedInUser = userRepository.findById(user.getUsername());
        if(loggedInUser.isPresent()) {
            if(loggedInUser.get().getPassword().equals(user.getPassword())) {
                return loggedInUser;
            }
        }
        return Optional.empty();                        // null
    }
}
