package com.peterpeck.usertable.service;
import java.util.*;

import com.peterpeck.usertable.model.User;
import com.peterpeck.usertable.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(int userid) {
        return userRepository.findById(userid).get();
    }

//    @Override
//    public User deleteUserById(int userid) {
//        return userRepository.deleteById(userid);
//    }

//    @Override
//    public User updateUserById(User user, int userid) {
//        return userRepository.save(books).get();
//    }
}
