package com.example.schooltimeserver.Controller;

import com.example.schooltimeserver.Service.RegisterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping(value = "/register")
public class RegisterController {

    private final RegisterService registerService;
}
