package com.example.spbackendv1.domain.user.repository;

import com.example.spbackendv1.domain.user.entity.RefreshToken;
import org.springframework.data.repository.CrudRepository;

public interface RefreshTokenRepository extends CrudRepository<RefreshToken, String> {
}
