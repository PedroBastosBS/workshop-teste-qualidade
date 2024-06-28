package com.atto.intelligence.entities;

public class AgriculturalInputEntity {
    final private String title;
    final private String description;
    final private String characteristics;
    final private String price;
    final private String type;

    public AgriculturalInputEntity(
                String title, 
                String description, 
                String characteristics, 
                String price,
                String type

    ) { 
        this.title = title;
        this.description = description;
        this.characteristics = characteristics;
        this.price = price;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCharacteristics() {
        return characteristics;
    }
    public String getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
