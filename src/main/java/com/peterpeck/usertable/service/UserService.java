package com.peterpeck.usertable.service;
import java.util.*;

import com.peterpeck.usertable.model.User;

public interface UserService {
     User saveUser(User user);
     User getUserById(int userid);
     User deleteUserById(int userid);
//     User updateUserById(int userid);
     List<User> getAllUsers();
}
