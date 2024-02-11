package com.example.demo.service;

import com.example.demo.UserModel.User;
import com.example.demo.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{


    private UserDAO userDao;
    @Autowired
    public UserServiceImpl(UserDAO theUserDao){
        userDao = theUserDao;
    }
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(String theemail) {
        Optional<User> result = userDao.findById(theemail);
        User user = null;
        if(result.isPresent())
        {
            user = result.get();
        }
        return user;
    }



    @Override
    public User save(User theUser) {
        return userDao.save(theUser);
    }
}
