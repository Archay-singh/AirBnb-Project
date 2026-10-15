package com.project.AirBnb.AirBnb.Service.Interfaces;

import java.util.List;

import com.project.AirBnb.AirBnb.Dto.HotelDTO;
import com.project.AirBnb.AirBnb.Dto.HotelInfoDto;

public interface HotelService {
    HotelDTO createNewHotel(HotelDTO hotelDto);
    HotelDTO getHotelById(Long id);
    HotelDTO updateHotelById(Long id, HotelDTO hotelDto);
    void deleteHotelById(Long id);
    void activateHotel(Long hotelId);
    HotelInfoDto getHotelInfoById(Long hotelId);
    List<HotelDTO> getAllHotels();
}
