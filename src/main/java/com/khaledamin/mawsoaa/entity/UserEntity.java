package com.khaledamin.mawsoaa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.UUID;

@Entity
@Data
@Table(name = "users",schema = "mawredy_database")
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id",columnDefinition = "BIGINT")
    @NonNull
    private Long userId;

    @Column(name = "user_firstname",columnDefinition = "VARCHAR(255)")
    @NonNull
    private String firstName;

    @NonNull
    @Column(name = "user_lastname",columnDefinition = "VARCHAR(255)")
    private String lastName;

    @NonNull
    @Column(name = "user_phone_number",columnDefinition = "VARCHAR(255)")
    private String userPhone;
    @Column(name = "user_username",columnDefinition = "VARCHAR(255)")
    @NonNull
    private String username;

    @Column(name = "user_email",columnDefinition = "VARCHAR(255)")
    @NonNull
    private String userEmail;

    @NonNull
    @JsonIgnore
    private String userPassword;

    @Column(name = "user_role",columnDefinition = "VARCHAR(255)",nullable = false)
    private String userRole = "USER";

    @Column(name = "user_token",columnDefinition = "VARCHAR(255)")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userToken = UUID.randomUUID().toString();
}
