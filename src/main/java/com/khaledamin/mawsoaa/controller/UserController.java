package com.khaledamin.mawsoaa.controller;


import com.khaledamin.mawsoaa.model.apirequests.LoginRequest;
import com.khaledamin.mawsoaa.model.apirequests.SignupRequest;
import com.khaledamin.mawsoaa.model.models.response.Response;
import com.khaledamin.mawsoaa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/V1")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Response login(@RequestBody LoginRequest request){
        return userService.login(request);
    }

    @PostMapping("/signup")
    public Response signup(@RequestBody SignupRequest request){
        return userService.signup(request);
    }
}
