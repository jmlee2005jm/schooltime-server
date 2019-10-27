package com.example.schooltimeserver.Service;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class LoginResponseTO {
    private Long userNum;
    private String name;
    private String message;

    public LoginResponseTO(Long userNum, String name , String message){
        this.userNum = userNum;
        this.name = name;
        this.message = message;
    }
}
