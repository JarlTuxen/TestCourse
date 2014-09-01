/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testcourse;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore; //added to allow use of @Ignore
import static org.junit.Assert.*;

/**
 *
 * @author jarltuxen
 */
public class AgileTestTest {
    
    public AgileTestTest() {
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
     * Test of add method, of class AgileTest.
     */
    @Test
    public void testAdd() {
        System.out.println("add Test 2,2");
        String s1 = "2";
        String s2 = "2";
        AgileTest instance = new AgileTest();
        int expResult = 4;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }

    @Test
    public void testAdd2() {
        System.out.println("add test 2,3");
        String s1 = "2";
        String s2 = "3";
        AgileTest instance = new AgileTest();
        int expResult = 5;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }
    
    @Test(timeout=1)
    public void testAdd3() {
        System.out.println("add Test with timeout");
        String s1 = "2";
        String s2 = "3";
        AgileTest instance = new AgileTest();
        int expResult = 5;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }
    
    @Ignore
    @Test(expected=NumberFormatException.class)
    public void testAdd4() {
        System.out.println("add Test with exception");
        String s1 = "2";
        String s2 = "beer";
        AgileTest instance = new AgileTest();
        int result = instance.add(s1, s2);
    }
}
