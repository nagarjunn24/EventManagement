package com.CollegeManagment.demo.REPOSITORY;

import com.CollegeManagment.demo.ENTITY.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
