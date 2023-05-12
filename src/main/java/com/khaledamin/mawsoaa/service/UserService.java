package com.khaledamin.mawsoaa.service;


import com.khaledamin.mawsoaa.model.apirequests.LoginRequest;
import com.khaledamin.mawsoaa.model.apirequests.SignupRequest;
import com.khaledamin.mawsoaa.model.models.response.Response;

public interface UserService {

    Response login(LoginRequest request);

    Response signup(SignupRequest request);
}
