
package com.mycompany.jenkin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author A.Belarbia BDEB
 */
public class SommeTest {
    
    public SommeTest() {
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
     * Test of add method, of class Somme.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String nbr1 = "33";
        String nbr2 = "10";
        int expResult = 43;
        int result = Somme.add(nbr1, nbr2);
        assertEquals(expResult, result);

    }

    /**
     * Test of Multiply method, of class Somme.
     */
//    @Test
//    public void testMultiply() {
//        System.out.println("Multiply");
//        String nbr1 = "5";
//        String nbr2 = "8";
//        int expResult = 33;
//        int result = Somme.Multiply(nbr1, nbr2);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
    
  
}
