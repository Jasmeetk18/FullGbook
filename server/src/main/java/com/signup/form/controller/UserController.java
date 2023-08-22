package com.signup.form.controller;

import com.signup.form.model.User;
import com.signup.form.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins="*")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/users")
    public List<User> getAllUser()
    {
        return userService.getAllUser();
    }
    @RequestMapping(method = RequestMethod.GET,value="/users/{username}")
    public Optional<User> getUserInfo(@PathVariable String username)
    {
        return userService.getUserInfo(username);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public User addUser(@RequestBody User user) { return userService.addUser(user);}
}
