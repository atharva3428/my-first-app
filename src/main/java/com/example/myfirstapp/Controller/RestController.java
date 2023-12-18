package com.example.myfirstapp.Controller;

import com.example.myfirstapp.UserModel.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/user")

public class RestController {
    private HashMap<String, User> userMap = new HashMap<>() ;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        userMap.put(user.getEmail(), user);
        return "User registrated successfully!";
    }

    @GetMapping("/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userMap.get(email);
    }

}
