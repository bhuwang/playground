/**
 * 
 */
package com.bhuwan.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author bhuwan
 *
 */
public class UsingBeforeAndAfter {
    
    @Before
    public void beforeExecutingTestCase(){
        System.out.println("UsingBeforeAndAfter#Before Getting Test Started1 ::");
    }
    
    @After
    public void afterExecutingTestCase(){
        System.out.println("UsingBeforeAndAfter#After Test Execution1 ::");
    }


    @Test
    public void testHelloWorld() {
        assertEquals("Would Say Hello", "Hello", "Hello");
        assertEquals(15, 45 / 3);
    }
    
    @Test
    public void testHelloWorld2() {
        assertEquals("Would Say Hello", "Hello", "Hello");
        assertEquals(15, 45 / 3);
    }

}
