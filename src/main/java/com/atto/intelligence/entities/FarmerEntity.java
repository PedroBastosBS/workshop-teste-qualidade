package com.atto.intelligence.entities;

public class FarmerEntity {
    final private String name;
    final private String document;
    final private String phone;

    public FarmerEntity(
                String name, 
                String document, 
                String phone
    ) { 
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
}
