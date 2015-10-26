/**
 * 
 */
package com.bhuwan.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.JUnitCore;

/**
 * Your class must be defined as public and have a default constructor. Your
 * Test method should be defined as a public, take no arguments and return void.
 * 
 * @author bhuwan
 */
@Category(Optional.class)
public class FirstJunitDemo {

    public static void main(String[] args) {
        JUnitCore.runClasses(FirstJunitDemo.class);
    }

    @Test
    public void testHelloWorld() {
        // Print a message before assertion
        System.out.println("Before Getting Test Started ::");

        // If assertion goes wrong, the execution of Test would fail
        assertEquals("Would Say Hello", "Hello", "Hello");

        assertEquals(15, 45 / 3);

        // Print a message after execution of Test; if assertion goes well, this
        // message would be shown
        System.out.println("After Test Execution ::");
    }

    @Test
    private void testHelloWorldPrivate() {
        // If assertion goes wrong, the execution of Test would fail
        assertEquals("Would Say Bhuwan", "Bhuwan", "Bhuwan");
        assertEquals(15, 45 / 3);
    }

    @Test
    public void testHelloWorldWithArgument(String name) {
        // If assertion goes wrong, the execution of Test would fail
        assertEquals("Would Say with Argument", "Argument", "Argument");
        assertEquals(15, 45 / 3);
    }

    @Test
    public String testHelloWorldWithReturn() {
        // If assertion goes wrong, the execution of Test would fail
        assertEquals("Would Say with Argument", "Argument", "Argument");
        assertEquals(15, 45 / 3);
        return null;
    }

}
