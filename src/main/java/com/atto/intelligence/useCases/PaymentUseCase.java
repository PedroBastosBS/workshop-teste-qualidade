package com.atto.intelligence.useCases;

public class PaymentUseCase {
    public Float inTerm(String price) {
        Float parse = Float.parseFloat(price);
        return parse * 2;
    }

    public Float inCash(String price) {
        Float parse = Float.parseFloat(price);
        return parse * 0.80f;
    }
}
