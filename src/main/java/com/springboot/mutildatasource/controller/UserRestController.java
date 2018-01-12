package com.springboot.mutildatasource.controller;

import com.springboot.mutildatasource.domain.User;
import com.springboot.mutildatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @Autowired
    UserService userService;

@RequestMapping(value = "api/user",method = RequestMethod.GET)
    public User findByName( @RequestParam(value = "userName",required = true) String userName){
        return userService.findByName(userName);
    }

}
