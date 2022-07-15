package com.example.backendclass.model.resource;

import com.example.backendclass.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class UserResource {

    @GetMapping("/user")
    public User getUser() {
       User user = new User("Rickey", "usa",  33 );
       return user;
    }

}