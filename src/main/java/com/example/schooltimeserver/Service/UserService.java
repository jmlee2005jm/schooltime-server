package com.example.schooltimeserver.Service;

import com.example.schooltimeserver.Domain.User;
import com.example.schooltimeserver.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger("UserService");
    private final UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public void CreateUser(UserTO userTO) {
        logger.info("createUser");
        User user = userTO.toEntity();
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public void DeleteUser(Long id){
        User user = userRepository.findByNum(id);
        logger.info("Delete user" + user.getId());
        userRepository.delete(user);
    }
}
