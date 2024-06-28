package com.atto.intelligence.units;

import com.atto.intelligence.useCases.PaymentUseCase;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PaymentTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PaymentTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PaymentTest.class );
    }

    public void testPaymentInCash()
    {
        Float price = 500.99f;
        Float priceExpect = 400.792f;

        PaymentUseCase useCase = new PaymentUseCase();

        assertEquals(priceExpect, useCase.inCash(price));
    }

    public void testPaymentInTerm()
    {
        Float price = 500.99f;
        Float priceExpect = 1001.98f;

        PaymentUseCase useCase = new PaymentUseCase();

        assertEquals(priceExpect, useCase.inTerm(price));
    }
}