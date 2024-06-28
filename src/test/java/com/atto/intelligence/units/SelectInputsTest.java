package com.atto.intelligence.units;

import java.util.HashMap;

import com.atto.intelligence.useCases.SelectInputsUseCase;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SelectInputsTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SelectInputsTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SelectInputsTest.class );
    }

    public void testSelectOneItem()
    {
        HashMap<String, HashMap<String, String>> products = new HashMap<>();

        HashMap<String, String> inputBean = new HashMap<>();
        inputBean.put("Title", "NPK - Soja");
        inputBean.put("Description", "Fertilizando para culturas");
        inputBean.put("Characteristics", "Composto de Nitrogenio, Fosoforo e potacio.");
        inputBean.put("price", "400");
        inputBean.put("Type", "Fertilizantes");

        HashMap<String, String> inputCorn = new HashMap<>();
        inputCorn.put("Title", "NPK - Milho");
        inputCorn.put("Description", "Fertilizando para culturas de milho");
        inputCorn.put("Characteristics", "Composto de Nitrogenio, Fosoforo e potacio.");
        inputCorn.put("price", "450");
        inputCorn.put("Type", "Fertilizantes");

        products.put("Beans", inputBean);
        products.put("Corns", inputCorn);
        
        SelectInputsUseCase selectInputs = new SelectInputsUseCase();
        HashMap<String, String> selectedProductForBeans = selectInputs.execute(products, "NPK - Soja");
        assertNotNull(selectedProductForBeans);
        assertEquals("NPK - Soja", selectedProductForBeans.get("Title"));
        assertEquals("Fertilizando para culturas", selectedProductForBeans.get("Description"));
        assertEquals("Composto de Nitrogenio, Fosoforo e potacio.", selectedProductForBeans.get("Characteristics"));
        assertEquals("400", selectedProductForBeans.get("price"));
        assertEquals("Fertilizantes", selectedProductForBeans.get("Type"));
    }
}