package com.atto.intelligence.useCases;

import java.util.HashMap;
import java.util.Map;

public class SelectInputsUseCase {
    public  HashMap<String, String> execute(HashMap<String,String> products, String name) {
        Map<String, String> productMap = 
                                        products.entrySet()
                                                .stream()
                                                .filter(entry -> entry.)();

    }
}
