package com.example.RegistrationLoginDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String name;
    private String userName;
    private String password;
    private String dob;

    @ElementCollection(targetClass=String.class)
    private List<String> technology;

}
