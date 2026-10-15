package com.project.AirBnb.AirBnb.Strategy;

import java.math.BigDecimal;

import com.project.AirBnb.AirBnb.Entities.InventoryEntity;

public class BasePricingStrategy implements PricingStrategy{
    @Override
    public BigDecimal calculatePrice(InventoryEntity inventory) {
        return inventory.getRoom().getBasePrice();
    }
}
