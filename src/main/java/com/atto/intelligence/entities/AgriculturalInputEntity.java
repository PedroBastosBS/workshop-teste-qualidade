package com.atto.intelligence.entities;

import java.util.Optional;

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
        this.validate(title, description, characteristics, type);
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

    private Optional<String> validate(String title, String description, String characteristics, String type) {
        if(title.isEmpty()) {
            return Optional.of("Title cannot be null or empty");
        } 
        if(description.isEmpty()) {
            return Optional.of("Description cannot be null or empty");
        }   
        if(characteristics.isEmpty()) {
            return Optional.of("Characteristics cannot be null or empty");
        }
        if(price.isEmpty()) {
            return Optional.of("Price cannot be null or empty");
        }
        if(type.isEmpty()) {
            return Optional.of("Type cannot be null or empty");
        }
        return Optional.empty();
    }
}
