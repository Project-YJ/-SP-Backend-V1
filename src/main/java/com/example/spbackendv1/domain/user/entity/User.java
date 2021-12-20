package com.example.spbackendv1.domain.user.entity;

import com.example.spbackendv1.domain.user.api.dto.request.JoinRequest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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

    public User(JoinRequest joinRequest) {
        this.userid = joinRequest.getUserid();
        this.email = joinRequest.getEmail();
        this.password = joinRequest.getPassword();
    }
}
