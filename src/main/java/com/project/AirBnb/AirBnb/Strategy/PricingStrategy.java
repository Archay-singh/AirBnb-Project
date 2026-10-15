package com.project.AirBnb.AirBnb.Strategy;

import java.math.BigDecimal;

import com.project.AirBnb.AirBnb.Entities.InventoryEntity;
public interface PricingStrategy {

    BigDecimal calculatePrice(InventoryEntity inventory);
}
