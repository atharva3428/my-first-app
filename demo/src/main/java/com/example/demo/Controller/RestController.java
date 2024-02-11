package com.example.demo.Controller;

import com.example.demo.UserModel.User;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    private UserService userService;

    public RestController(UserService theUserService){
        userService= theUserService;
    }

    @GetMapping("/users")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/users/{theemail}")
    public User getUser(@PathVariable String theemail)
    {
        User theUser = userService.findById(theemail);
        return theUser;
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User theUser)
    {
        User user = userService.save(theUser);
        return user;
    }



}
