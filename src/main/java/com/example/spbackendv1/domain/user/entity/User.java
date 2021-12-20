package com.example.spbackendv1.domain.user.entity;

import com.example.spbackendv1.domain.user.api.dto.request.JoinRequest;
import com.example.spbackendv1.domain.user.enumeration.Roles;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.annotation.PostConstruct;
import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User {

    @Id
    private String userid;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String nickname;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Roles role;

    public User(JoinRequest joinRequest) {
        this.userid = joinRequest.getUserid();
        this.email = joinRequest.getEmail();
        this.password = joinRequest.getPassword();
    }

    @PostConstruct
    public void defaultRole() {
        this.role = Roles.ROLE_UNAUTHORIZED;
    }
}
