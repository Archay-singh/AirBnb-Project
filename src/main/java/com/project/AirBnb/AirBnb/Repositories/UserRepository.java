package com.project.AirBnb.AirBnb.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.AirBnb.AirBnb.Entities.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);
}
