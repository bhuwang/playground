/**
 * 
 */
package com.bhuwan.java.reflection;

import java.io.IOException;

/**
 * @author bhuwan
 *
 */
public final class Student extends Person {

    static int rollNo;
    public static final int LAST_DAY_OF_WEEK = 6;
    public int empId = 123;

    public void m1() throws IOException {

    }

    public int m1(int a, int b) throws ArithmeticException {
        return a + b;
    }
}

class Person {
    public int parentInt;
    public String parentString;
}
