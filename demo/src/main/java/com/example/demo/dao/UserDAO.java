package com.example.demo.dao;

import com.example.demo.UserModel.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,String> {


}
