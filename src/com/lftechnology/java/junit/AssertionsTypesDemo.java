/**
 * 
 */
package com.lftechnology.java.junit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author bhuwan
 */
public class AssertionsTypesDemo {
    @Test
    public void assertEqualArraysTest() {

        // Declare first array
        int[] arr1 = { 1, 2, 3, 4 };

        // Declare second array
        int[] arr2 = { 1, 2, 3, 4 };

        // using assert that
        assertThat(arr1, is(equalTo(arr2)));
        assertThat(arr1, is(arr2));
        assertThat(arr1, equalTo(arr2));
        // using assertArrayEquals
        assertArrayEquals(arr1, arr2);
        assertTrue(Arrays.equals(arr1, arr2));
        assertEquals(Arrays.toString(arr1), Arrays.toString(arr2));
    }

    @Test
    public void assertNoEqualArraysTest() {
        // Declare first array
        int[] arr1 = { 1, 2, 3, 4 };

        // Declare second array
        int[] arr2 = { 1, 2, 3, 5 };

        assertThat(arr1, is(not(arr2)));
        assertThat(arr1, not(arr2));
        assertFalse(Arrays.equals(arr1, arr2));
        assertNotEquals(Arrays.toString(arr1), Arrays.toString(arr2));
    }

    @Test
    public void assertEqualsTest() {
        // Declare first object
        String message1 = "Hi World";

        // Declare second object
        String message2 = message1;

        // using assert that
        assertThat(message1, is(equalTo(message2)));
        assertThat(message1, is(message2));
        assertThat(message1, equalTo(message2));
        // using assertArrayEquals
        assertTrue("Two words are euqal", message1.equals(message2));
        assertEquals(message1, message2);
    }

    @Test
    public void assertNotEqualsTest() {
        // Declare first object
        String message1 = "Hi World";

        // Declare second object
        String message2 = "HI World";

        // using assert that
        assertThat(message1, is(not(equalTo(message2))));
        assertThat(message1, is(not(message2)));
        assertThat(message1, not(message2));
        // using assertArrayEquals
        assertFalse("Two words are euqal", message1.equals(message2));
        assertNotEquals(message1, message2);
    }

    @Test
    public void assertSameTest() {
        // Declare first object
        String message1 = "Hi World";

        // Declare second object
        String message2 = message1;

        assertSame("Objects Are Same ::", message1, message2);
    }

    @Test
    public void assertNotSameTest() {
        // Declare first object
        String message1 = "Hi World";

        // Declare second object
        String message2 = "HI World";

        // Assert
        assertNotSame("Objects Aren't Same ::", message1, message2);
    }

    @Test
    public void assertTrueTest() {
        // Declare first object
        String message1 = "Hi World";

        // Declare second object
        String message2 = message1;

        assertTrue("Result True ::", message1.equals(message2));
    }

    @Test
    public void assertNotTrueTest() {
        // Declare first object
        String message1 = "Hi World";

        // Declare second object
        String message2 = "HI World";

        assertFalse("Result Isn't True ::", message1.equals(message2));
    }

    @Test
    public void assertNullTest() {
        // Declare first object
        String message1 = null;

        assertNull("Result Is Null ::", message1); 
    }

    @Test
    public void assertNotNullTest() {
        // Declare first object
        String message1 = "Hi World";

         assertNotNull("Result True ::", message1); 
    }
}
