package com.nahidsohel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SignUpForm {

    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String password;
}
