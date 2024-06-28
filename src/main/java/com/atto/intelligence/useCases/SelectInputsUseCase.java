package com.atto.intelligence.useCases;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SelectInputsUseCase {
    public HashMap<String, String> execute(HashMap<String, HashMap<String, String>> products, String name) {
       Optional<Map.Entry<String, HashMap<String, String>>> productEntry = products.entrySet()
                .stream()
                .filter(entry -> entry.getValue().get("Title").equals(name))
                .findFirst();
        
        return productEntry.map(Map.Entry::getValue).orElse(null);
    }
}
