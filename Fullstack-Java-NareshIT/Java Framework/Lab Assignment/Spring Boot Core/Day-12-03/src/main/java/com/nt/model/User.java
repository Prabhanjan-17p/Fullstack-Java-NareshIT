package com.nt.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component("user")
@Getter
@Setter
@ToString
public class User {

    @Value("${user.id}")
    private int userId;

    @Value("${user.name}")
    private String userName;

    @Autowired
    private Address address; 

}
