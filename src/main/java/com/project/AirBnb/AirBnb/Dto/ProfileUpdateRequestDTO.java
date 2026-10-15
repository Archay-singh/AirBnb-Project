package com.project.AirBnb.AirBnb.Dto;

import lombok.Data;

import java.time.LocalDate;

import com.project.AirBnb.AirBnb.Enums.Gender;

@Data
public class ProfileUpdateRequestDTO {
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
}
