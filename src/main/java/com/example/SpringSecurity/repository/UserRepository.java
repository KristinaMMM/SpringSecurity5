package com.example.SpringSecurity.repository;

import com.example.SpringSecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "SELECT * FROM USER WHERE USER_NAME = ?", nativeQuery = true)
    Optional<User> findByUserName(String userName);
}
