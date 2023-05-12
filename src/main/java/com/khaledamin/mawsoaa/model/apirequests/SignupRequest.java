package com.khaledamin.mawsoaa.model.apirequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupRequest {

    @NonNull
    private String email;

    @NonNull
    private String username;

    @NonNull
    private String password;

    @NonNull
    private String firstname;

    @NonNull
    private String lastName;

    @NonNull
    private String phoneNumber;
}
