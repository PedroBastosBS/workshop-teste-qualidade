package com.atto.intelligence.units;

import com.atto.intelligence.entities.FarmerEntity;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FarmerTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FarmerTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FarmerTest.class );
    }

    public void testFarmerName()
    {
        String nameExpected = "Filisbino de lima";
        String document = "000.000.000-01";
        String phone = "(66) 9999-9999";

        FarmerEntity farmer = new FarmerEntity(nameExpected, document, phone);
        assertEquals(nameExpected, farmer.getName());
    }

    public void testFarmerDocument()
    {
        String name = "Filisbino de lima";
        String documentExpected = "000.000.000-01";
        String phone = "(66) 9999-9999";

        FarmerEntity farmer = new FarmerEntity(name, documentExpected, phone);
        assertEquals(documentExpected, farmer.getDocument());
    }

    public void testFarmerPhone()
    {
        String name = "Filisbino de lima";
        String document = "000.000.000-01";
        String phoneExpected = "(66) 9999-9999";

        FarmerEntity farmer = new FarmerEntity(name, document, phoneExpected);
        assertEquals(phoneExpected, farmer.getPhone());
    }
}
