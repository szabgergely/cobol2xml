/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dwpbank.xgen.test.coboltransformer;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gergo
 */
public class TransformerTest {
    
    public TransformerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of transform method, of class Transformer.
     */
    @Test
    public void testTransform_3args() throws Exception {
        System.out.println("transform");
        File xmlDescriptionFile =  new File("/home/gergo/NetBeansProjects/XmlValidator/tst/DPW1021.xmd");
        File fileToTransform = new File("/home/gergo/NetBeansProjects/XmlValidator/tst/cobol.audit");
        boolean storeTransformed = false;
        Transformer instance = new Transformer();
        instance.transform(xmlDescriptionFile, fileToTransform, storeTransformed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transform method, of class Transformer.
     */
    @Test
    public void testTransform_File_File() {
        System.out.println("transform");
        File xmlDescriptionFile = null;
        File fileToTransform = null;
        Transformer instance = new Transformer();
        instance.transform(xmlDescriptionFile, fileToTransform);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
