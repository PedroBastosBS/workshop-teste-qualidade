package com.atto.intelligence.entities;

import java.util.Optional;

public class FarmerEntity {
    final private String name;
    final private String document;
    final private String phone;

    public FarmerEntity(
                String name, 
                String document, 
                String phone
    ) { 
        this.validate(name, document, phone);
        this.name = name;
        this.document = document;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    public String getPhone() {
        return phone;
    }

    private Optional<String> validate(String name, String document, String phone) {
        if(name.isEmpty()) {
            return Optional.of("Name cannot be null or empty");
        } 
        if(document.isEmpty()) {
            return Optional.of("Document cannot be null or empty");
        }   
        if(phone.isEmpty()) {
            return Optional.of("Phone cannot be null or empty");
        }
        return Optional.empty();
    }
    
}
