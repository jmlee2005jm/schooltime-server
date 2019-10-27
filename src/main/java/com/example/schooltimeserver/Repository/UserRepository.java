package com.example.schooltimeserver.Repository;

import com.example.schooltimeserver.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(String Id);
}
