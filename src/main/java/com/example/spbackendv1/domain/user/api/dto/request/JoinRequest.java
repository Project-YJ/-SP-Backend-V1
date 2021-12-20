package com.example.spbackendv1.domain.user.api.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
public class JoinRequest {

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String userid;

    @NotBlank
    private String password;

}
