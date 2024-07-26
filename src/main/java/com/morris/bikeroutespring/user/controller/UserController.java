package com.morris.bikeroutespring.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.morris.bikeroutespring.user.entity.User;
import com.morris.bikeroutespring.user.repository.UserRepository;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    public User constructUser(String id, String email, String password, String name, String birth, String province,
            String city) {
        // created init 안한 코드
        User user = new User(id, name, birth, email, password, province, city, 0.0, city, false);
        return user;
    }

    @QueryMapping
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
