package com.atto.intelligence.useCases;

import java.util.HashMap;

import com.atto.intelligence.entities.AgriculturalInputEntity;

public class ProductRegistrationUseCase {
    public HashMap<String, String> execute(AgriculturalInputEntity product) {
        HashMap<String, String> result = new HashMap<>();
        result.put("Title", product.getTitle());
        result.put("Description", product.getDescription());
        result.put("Characteristics", product.getCharacteristics());
        result.put("price", product.getPrice());
        result.put("Type", product.getType());
        return result;
    }
}
