package com.lion09.account;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class SignUpForm {

    @NotBlank
    private String email;
    private String nickname;
    private String password;
}
