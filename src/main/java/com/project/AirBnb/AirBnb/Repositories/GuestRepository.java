package com.project.AirBnb.AirBnb.Repositories;

import com.project.AirBnb.AirBnb.Dto.GuestDTO;
import com.project.AirBnb.AirBnb.Entities.GuestEntity;
import com.project.AirBnb.AirBnb.Entities.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepository extends JpaRepository<GuestEntity, Long> {
    List<GuestDTO> findByUser(UserEntity user);
}