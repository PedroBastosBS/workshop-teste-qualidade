package com.atto.intelligence.units;

import com.atto.intelligence.entities.FarmerEntity;
import com.atto.intelligence.useCases.FarmerRegistrationUseCase;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FarmerRegistrationTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FarmerRegistrationTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FarmerRegistrationTest.class );
    }

    public void testResgistrationFarmer()
    {
        String name = "Filisbino de lima";
        String document = "000.000.000-01";
        String phone = "(66) 9999-9999";
        String expected = "Farmer Filisbino de lima successfully registered.";

        FarmerEntity farmer = new FarmerEntity(name, document, phone);
        FarmerRegistrationUseCase registration = new FarmerRegistrationUseCase();
        assertEquals(expected, registration.execute(farmer));
    }
}