package com.khaledamin.mawsoaa.repository;


import com.khaledamin.mawsoaa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

    public UserEntity findByUserEmail(String email);
}
