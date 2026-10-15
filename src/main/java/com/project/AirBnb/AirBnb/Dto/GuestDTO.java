package com.project.AirBnb.AirBnb.Dto;

import com.project.AirBnb.AirBnb.Entities.UserEntity;
import com.project.AirBnb.AirBnb.Enums.Gender;

import lombok.Data;

@Data
public class GuestDTO {
    private Long id;
    private String name;
    private Gender gender;
    private Integer age;
}
