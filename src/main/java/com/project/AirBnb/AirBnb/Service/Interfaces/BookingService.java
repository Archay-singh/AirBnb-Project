package com.project.AirBnb.AirBnb.Service.Interfaces;

import com.project.AirBnb.AirBnb.Dto.BookingDTO;
import com.project.AirBnb.AirBnb.Dto.BookingRequest;
import com.project.AirBnb.AirBnb.Dto.GuestDTO;
import com.project.AirBnb.AirBnb.Dto.HotelReportDTO;
import com.project.AirBnb.AirBnb.Enums.BookingStatus;
import com.stripe.model.Event;

import java.time.LocalDate;
import java.util.List;

public interface BookingService {
    BookingDTO initialiseBooking(BookingRequest bookingRequest);

    BookingDTO addGuests(Long bookingId, List<GuestDTO> guestDtoList);

    String initiatePayments(Long bookingId);

    void capturePayment(Event event);

    void cancelBooking(Long bookingId);

    BookingStatus getBookingStatus(Long bookingId);

    List<BookingDTO> getAllBookingsByHotelId(Long hotelId);

    HotelReportDTO getHotelReport(Long hotelId, LocalDate startDate, LocalDate endDate);

    List<BookingDTO> getMyBookings();
}
