package com.example.spbackendv1.domain.user.repository;

import com.example.spbackendv1.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, String> {
}
