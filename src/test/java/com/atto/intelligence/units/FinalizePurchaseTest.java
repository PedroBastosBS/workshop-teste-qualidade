package com.atto.intelligence.units;

import com.atto.intelligence.useCases.FinalizePurchaseUseCase;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FinalizePurchaseTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FinalizePurchaseTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FinalizePurchaseTest.class );
    }

    public void testFinalizePurchese()
    {
        String expected = "Purchase made successfully!";
        FinalizePurchaseUseCase useCase = new FinalizePurchaseUseCase();
        assertEquals(expected, useCase.execute());
    }
}