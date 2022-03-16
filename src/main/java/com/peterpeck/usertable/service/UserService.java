package com.peterpeck.usertable.service;
import java.util.*;

import com.peterpeck.usertable.model.User;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}
