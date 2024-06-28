package com.atto.intelligence.units;

import java.util.HashMap;

import com.atto.intelligence.entities.AgriculturalInputEntity;
import com.atto.intelligence.useCases.ProductRegistrationUseCase;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ProductRegistrationTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ProductRegistrationTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ProductRegistrationTest.class );
    }

    public void testRegistrationProduct()
    {
        
        String titleExpected = "NPK - Soja";
        String description = "Fertilizando para culturas";
        String characteristics = "Composto de Nitrogenio, Fosoforo e potacio.";
        String price = "400";
        String type = "Fertilizantes";

        AgriculturalInputEntity input = new AgriculturalInputEntity(titleExpected, description, characteristics, price, type);
        ProductRegistrationUseCase products = new ProductRegistrationUseCase();
        HashMap<String, String> result = products.execute(input);
        assertNotNull(result);
        assertEquals(titleExpected, result.get("Title"));
        assertEquals(description, result.get("Description"));
        assertEquals(characteristics, result.get("Characteristics"));
        assertEquals(price, result.get("price"));
        assertEquals(type, result.get("Type"));
    }
}