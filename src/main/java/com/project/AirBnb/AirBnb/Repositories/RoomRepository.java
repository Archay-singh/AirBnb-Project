package com.project.AirBnb.AirBnb.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.AirBnb.AirBnb.Entities.RoomEntity;

@Repository
public interface RoomRepository extends JpaRepository<RoomEntity,Long> {
}
