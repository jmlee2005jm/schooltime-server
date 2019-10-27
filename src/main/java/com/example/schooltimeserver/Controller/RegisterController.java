package com.example.schooltimeserver.Controller;

import com.example.schooltimeserver.Domain.User;
import com.example.schooltimeserver.Service.RegisterService;
import com.example.schooltimeserver.Service.UserTO;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping(value = "/users")
public class RegisterController {
    private final RegisterService registerService;

    @PostMapping
    public void register(@RequestBody UserTO userTO) {
        registerService.CreateUser(userTO);
    }
}
