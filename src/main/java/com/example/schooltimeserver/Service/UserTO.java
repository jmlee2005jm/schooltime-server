package com.example.schooltimeserver.Service;

import com.example.schooltimeserver.Domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class UserTO {
    private String id;
    private String password;
    private String name;

    public User toEntity(){
        return User.builder()
                .id(id)
                .password(password)
                .name(name).build();
    }

    public UserTO(User user){
        this.id = user.getId();
        this.password = user.getPassword();
        this.name = user.getName();
    }
}
