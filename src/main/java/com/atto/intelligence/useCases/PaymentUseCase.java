package com.atto.intelligence.useCases;

public class PaymentUseCase {
    public Float inTerm(Float price) {
        return price * 2;
    }

    public Float inCash(Float price) {
        return price * 0.80f;
    }
}
