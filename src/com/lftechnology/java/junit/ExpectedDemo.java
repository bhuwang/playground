/**
 * 
 */
package com.lftechnology.java.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * @author bhuwan
 */
@Category(Mandatory.class)
public class ExpectedDemo {

    @BeforeClass
    public static void beforeExecutingTestCase() {
        System.out.println("ExpectedDemo###Before Getting Test Started1 ::");
    }

    @AfterClass
    public static void afterExecutingTestCase() {
        System.out.println("After Test Execution1 ::");
    }

    @SuppressWarnings("null")
    @Test(expected=NullPointerException.class)
    public void testNullPointerExceptionRequired() {
        Integer var = null;
       // System.out.println("Value :: "+ var);
        System.out.println("Value :: "+ var.intValue());
    }

    @Test(timeout = 1)
    public void testWait() {
        // Test Will Be Waiting For 100 Milliseconds
        // Supposed Task Should Be Done Before Timeout
        for (int i = 0; i < 100; i++) {
            Math.random();
        }
        System.out.println("Test Run Before Timeout :: This Test Has Finished Sucessfully ::");
    }

}
