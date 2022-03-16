package com.peterpeck.usertable.controller;
import java.util.*;

import com.peterpeck.usertable.model.User;
import com.peterpeck.usertable.repository.UserRepository;
import com.peterpeck.usertable.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/save")
    public String add(@RequestBody User user){
        userService.saveUser(user);
        return "New student is added";
    }

    @GetMapping("/get/{userid}")
    public User getUsers(@PathVariable("userid") int userid){
        return userService.getUserById(userid);
    }

    @DeleteMapping("/delete/{userid}")
    public String delete(@PathVariable("userid") int userid){
        userService.deleteUserById(userid);
        return "User is deleted!";
    }
//
    @PutMapping("/update/{userid}")
    public String update(@RequestBody User updatedUser, @PathVariable("userid") int userid){
        userService.updateUserById(updatedUser, userid);
        return "User is updated!";
    }
}
