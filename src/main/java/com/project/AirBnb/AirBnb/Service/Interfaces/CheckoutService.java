package com.project.AirBnb.AirBnb.Service.Interfaces;


import com.project.AirBnb.AirBnb.Entities.BookingEntity;

public interface CheckoutService {

    String getCheckoutSession(BookingEntity booking, String successUrl, String failureUrl);

}
