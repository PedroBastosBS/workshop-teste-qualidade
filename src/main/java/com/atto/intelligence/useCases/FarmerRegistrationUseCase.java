package com.atto.intelligence.useCases;

import com.atto.intelligence.entities.FarmerEntity;

public class FarmerRegistrationUseCase {
    public String execute(FarmerEntity farmer) {
        return String.format("Farmer %s successfully registered.", farmer.getName());
    }
}
