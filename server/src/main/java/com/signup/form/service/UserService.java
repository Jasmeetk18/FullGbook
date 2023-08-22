package com.signup.form.service;

import com.signup.form.model.User;
import com.signup.form.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.String;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser()
    {
        List<User> users= new ArrayList<>();
        userRepository.findAll().forEach(user  -> users.add(user));
        return users;
    }
    public Optional<User> getUserInfo( String username)
    {
        return userRepository.findById(username);
    }

    public User addUser(User  user)
    {
        userRepository.save(user);
        return user; 
    }
}
