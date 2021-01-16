package com.lion09.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {

    @Id @GeneratedValue
    private Long id;
    private String password;

    @Column(unique = true)
    private String email;
    private boolean emailVerified;
    private String emailCheckToken;
    private LocalDateTime emailCheckTokenGeneratedAt;

    @Column(unique = true)
    private String nickname;

    private LocalDateTime joinedAt;
    private String location;

    @Column(unique = true)
    private String phone;


}
