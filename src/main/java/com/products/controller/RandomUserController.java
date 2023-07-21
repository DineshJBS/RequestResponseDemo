package com.products.controller;

import com.products.dto.User;
import com.products.dto.UserResponse;
import com.products.service.UserResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serial;
import java.util.List;

@RestController
@RequestMapping("/user")
public class RandomUserController {

    @Autowired
    private UserResponseService service;

    @GetMapping
    public List<User> getResponse(){

        System.out.println(service.getRandomUser().toString());
        return service.getRandomUser();
    }
}
