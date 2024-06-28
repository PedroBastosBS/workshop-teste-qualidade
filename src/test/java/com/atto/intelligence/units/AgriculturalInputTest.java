package com.atto.intelligence.units;

import com.atto.intelligence.entities.AgriculturalInputEntity;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AgriculturalInputTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AgriculturalInputTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AgriculturalInputTest.class );
    }

    public void testInputTitle()
    {
        String titleExpected = "NPK - Soja";
        String description = "Fertilizando para culturas";
        String characteristics = "Composto de Nitrogenio, Fosoforo e potacio.";
        String price = "400";
        String type = "Fertilizantes";

        AgriculturalInputEntity input = new AgriculturalInputEntity(titleExpected, description, characteristics, price, type);
        assertEquals(titleExpected, input.getTitle());
    }

    public void testInputDescription()
    {
        String title = "NPK - Soja";
        String descriptionExpected = "Fertilizando para culturas";
        String characteristics = "Composto de Nitrogenio, Fosoforo e potacio.";
        String price = "400";
        String type = "Fertilizantes";

        AgriculturalInputEntity input = new AgriculturalInputEntity(title, descriptionExpected, characteristics, price, type);
        assertEquals(descriptionExpected, input.getDescription());
    }

    public void testInputCharacteristics()
    {
        String title = "NPK - Soja";
        String description = "Fertilizando para culturas";
        String characteristicsExpected = "Composto de Nitrogenio, Fosoforo e potacio.";
        String price = "400";
        String type = "Fertilizantes";

        AgriculturalInputEntity input = new AgriculturalInputEntity(title, description, characteristicsExpected, price, type);
        assertEquals(characteristicsExpected, input.getCharacteristics());
    }

    public void testInputPrice()
    {
        String title = "NPK - Soja";
        String description = "Fertilizando para culturas";
        String characteristics = "Composto de Nitrogenio, Fosoforo e potacio.";
        String priceExpected = "400";
        String type = "Fertilizantes";

        AgriculturalInputEntity input = new AgriculturalInputEntity(title, description, characteristics, priceExpected, type);
        assertEquals(priceExpected, input.getPrice());
    }
    
    public void testInputType()
    {
        String title = "NPK - Soja";
        String description = "Fertilizando para culturas";
        String characteristics = "Composto de Nitrogenio, Fosoforo e potacio.";
        String price = "400";
        String typeExpected = "Fertilizantes";

        AgriculturalInputEntity input = new AgriculturalInputEntity(title, description, characteristics, price, typeExpected);
        assertEquals(typeExpected, input.getType());
    }
}