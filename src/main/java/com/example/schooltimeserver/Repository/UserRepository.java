package com.example.schooltimeserver.Repository;

import com.example.schooltimeserver.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(String Id); //이메일 아이디
    User findByNum (Long num); //고유 넘버
}
