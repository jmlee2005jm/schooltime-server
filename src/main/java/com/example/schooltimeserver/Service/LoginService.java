package com.example.schooltimeserver.Service;

import com.example.schooltimeserver.Domain.User;
import com.example.schooltimeserver.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoginService {
    private final UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User login(LoginTO loginTO) {
        User user = userRepository.findByEmail(loginTO.getEmail());
        if(user != null && bCryptPasswordEncoder.matches(loginTO.getPassword(), user.getPassword())){
            LoggerFactory.getLogger("LoginService").info("####login: Success "+ user.getId() + ", "+ user.getName());
        } else {
            user = null;
        }
        return user;
    }
}
