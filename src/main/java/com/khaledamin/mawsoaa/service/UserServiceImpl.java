package com.khaledamin.mawsoaa.service;

import com.khaledamin.mawsoaa.entity.UserEntity;
import com.khaledamin.mawsoaa.model.apirequests.LoginRequest;
import com.khaledamin.mawsoaa.model.apirequests.SignupRequest;
import com.khaledamin.mawsoaa.model.models.response.FailedResponse;
import com.khaledamin.mawsoaa.model.models.response.Response;
import com.khaledamin.mawsoaa.model.models.response.SuccessResponse;
import com.khaledamin.mawsoaa.model.models.response.SuccessResponseWithData;
import com.khaledamin.mawsoaa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Response login(LoginRequest request) {
       UserEntity user = userRepository.findByUserEmail(request.getEmail());
        if (user == null) {
            return new FailedResponse("No user with the mentioned username exists");
        }

        if (request.getEmail().equals(user.getUserEmail()) && passwordEncoder.matches(request.getPassword(),user.getUserPassword())){
            return new SuccessResponseWithData<>("User logged in successfully",user);
        } else {
            return new FailedResponse("Username or password not correct");
        }

    }

    @Override
    public Response signup(SignupRequest request) {
        UserEntity user = userRepository.findByUserEmail(request.getUsername());
        if (user != null){
            return new FailedResponse("Can't sign up, " + user.getUserEmail() + "already exists");
        } else {
            user = new UserEntity();
            user.setUserEmail(request.getEmail());
            user.setUserPassword(passwordEncoder.encode(request.getPassword()));
            user.setUserRole("USER");
            user.setUserToken(UUID.randomUUID().toString());
            user.setFirstName(request.getFirstname());
            user.setLastName(request.getLastName());
            user.setUsername(request.getUsername());
            user.setUserPhone(request.getPhoneNumber());
            userRepository.save(user);
            return new SuccessResponse("User signed up successfully");

        }

    }
}
