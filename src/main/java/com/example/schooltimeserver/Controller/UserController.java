package com.example.schooltimeserver.Controller;

import com.example.schooltimeserver.Service.UserService;
import com.example.schooltimeserver.Service.UserTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping(value = "/users")
public class UserController {
    private final UserService userService;

    @PostMapping
    public void register(@RequestBody UserTO userTO) {
        userService.CreateUser(userTO);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.DeleteUser(id);
    }
}
