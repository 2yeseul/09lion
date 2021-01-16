package com.lion09.account;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class SignUpForm {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Pattern(regexp = "^[ㄱ-ㅎ가-힣a-z0-9_-]{3,20}$")
    @Length(min = 3, max = 10)
    private String nickname;

    @NotBlank
    @Length(min = 8, max = 50)
    private String password;
}
