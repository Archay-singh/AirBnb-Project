package com.project.AirBnb.AirBnb.Service.Interfaces;

import com.project.AirBnb.AirBnb.Dto.ProfileUpdateRequestDTO;
import com.project.AirBnb.AirBnb.Dto.UserDTO;
import com.project.AirBnb.AirBnb.Entities.UserEntity;

public interface UserService {
    UserEntity getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDTO profileUpdateRequestDto);

    UserDTO getMyProfile();
}
