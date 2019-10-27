package com.example.schooltimeserver.Controller;

import com.example.schooltimeserver.Domain.User;
import com.example.schooltimeserver.Service.LoginResponseTO;
import com.example.schooltimeserver.Service.LoginService;
import com.example.schooltimeserver.Service.LoginTO;
import lombok.AllArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping(value = "/login")
public class LoginController {

    private final LoginService loginService;

    @PostMapping
    public ResponseEntity<LoginResponseTO> login(@RequestBody LoginTO loginTO) {
        User user = loginService.login(loginTO);
        ResponseEntity<LoginResponseTO> responseEntity;
        if(user != null){
            LoggerFactory.getLogger("LoginController").info("login: user id = " + user.getId());
            responseEntity = new ResponseEntity<>(new LoginResponseTO(user.getNum(), user.getName(), "Success"), HttpStatus.OK);
        } else {
            LoggerFactory.getLogger("LoginController").info("Authentification Error");
            responseEntity = new ResponseEntity<>(new LoginResponseTO(-999L, "", "Authentification Error"), HttpStatus.UNAUTHORIZED);
        }
        return responseEntity;
    }
}
