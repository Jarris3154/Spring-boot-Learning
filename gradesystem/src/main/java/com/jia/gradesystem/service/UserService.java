package com.jia.gradesystem.service;

import com.jia.gradesystem.message.LoginResponse;
import com.jia.gradesystem.model.Role;
import com.jia.gradesystem.model.User;
import com.jia.gradesystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public LoginResponse loginCheck(User user) {
        String password = user.getPassword();
        User userData = this.userRepository.findByUsername(user.getUsername(), user.getPassword());
        String passwordData = userData.getPassword();
        Role role = user.getRole();
        if (password.equals(passwordData) && userData.getRole() == role) {
            LoginResponse.Success.setUser(userData);
            return LoginResponse.Success;
        }
        return LoginResponse.Fail;
    }
    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User create(User user){
        return userRepository.insert(user);
    }
}
