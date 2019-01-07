package com.example2.practice.controllers;


import com.example2.practice.domain.User;
import com.example2.practice.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {

    private HelloService helloService;

    @Autowired
    public UserController(HelloService helloservie) { this.helloService = helloservie; }

    @GetMapping(value= "api/v1/user")
    public User getUser() {
        User user = new User();
        user.setName("paulham");
        return user;
    }

    @GetMapping(value = "apu/v1/hello")
        public String getHello () { return this.helloService.getHello() ; }

}
