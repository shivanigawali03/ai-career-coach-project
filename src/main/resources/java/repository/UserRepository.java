package com.seroter.azure_basic_app.repository;

import com.seroter.azure_basic_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;   // ✅ IMPORTANT

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}