package com.example.schooltimeserver.Domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long num;

    @Column(unique = true, columnDefinition = "varchar(50)", nullable = false)
    private String id;
    
    @Column(columnDefinition = "varchar(255)", nullable = false)
    private String password;
    
    @Column(columnDefinition = "varchar(20)", nullable = false)
    private String name;
    
    @Builder
    public User(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }
    public void setPassword(String password){
     this.password = password;   
    }
}
