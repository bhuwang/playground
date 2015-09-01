/**
 * 
 */
package com.lftechnology.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * @author bhuwan
 */
@Category(Mandatory.class)
public class BeforeClassAndAfterClass {

    @BeforeClass
    public static void beforeExecutingTestCase() {
        System.out.println("BeforeClassAndAfterClass###Before Getting Test Started1 ::");
    }

    @AfterClass
    public static void afterExecutingTestCase() {
        System.out.println("After Test Execution1 ::");
    }

    @Test
    @Category(Optional.class)
    public void testHelloWorld3() {
        System.out.println(this + "Test 3 ::");
        assertEquals("Would Say Hello", "Hello", "Hello");
        assertEquals(15, 45 / 3);
    }

    @Test
    public void testHelloWorld1() {
        System.out.println(this + "Test 1 ::");
        assertEquals("Would Say Hello", "Hello", "Hello");
        assertEquals(15, 45 / 3);
    }

    @Test
    public void testHelloWorld2() {
        System.out.println(this + "Test 2 ::");
        assertEquals("Would Say Hello", "Hello", "Hello");
        assertEquals(15, 45 / 3);
    }

    @Test
    public void testHelloWorld0() {
        System.out.println(this + "Test 0 ::");
        assertEquals("Would Say Hello", "Hello", "Hello");
        assertEquals(15, 45 / 3);
    }

}
