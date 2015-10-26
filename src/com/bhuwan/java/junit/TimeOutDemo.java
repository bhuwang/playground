/**
 * 
 */
package com.bhuwan.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author bhuwan
 */

public class TimeOutDemo {

    @BeforeClass
    public static void beforeExecutingTestCase() {
        System.out.println("TimeOutDemo####Before Getting Test Started1 ::");
    }

    @AfterClass
    public static void afterExecutingTestCase() {
        System.out.println("After Test Execution1 ::");
    }

    @Test
    public void testHelloWorld() {
        assertEquals("Would Say Hello", "Hello", "Hello");
        assertEquals(15, 45 / 3);
    }

    @Test(timeout = 1)
    public void testWait() {
        // Supposed Task Should Be Done Before Timeout
        for (int i = 0; i < 100; i++) {
            Math.random();
        }
        System.out.println("Test Run Before Timeout :: This Test Has Finished Sucessfully ::");
    }

}
