package com.example.demo.service;

import com.example.demo.UserModel.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(String theemail);

    User save(User theUser);


}
