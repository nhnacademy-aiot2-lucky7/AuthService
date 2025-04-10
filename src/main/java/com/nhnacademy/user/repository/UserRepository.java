package com.nhnacademy.user.repository;

import com.nhnacademy.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, CustomUserRepository {
    boolean existsByUserEmail(String userEmail);
}
