package com.sac.project.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sac.project.domain.User;
import com.sac.project.service.UserService;

@RestController
@CrossOrigin
@RequestMapping(value = "/login")
public class LoginController{
    
    @Autowired
    private UserService userService; 
}





