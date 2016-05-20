/**
 * 
 */
package com.bhuwan.java.basics.oop.overriding;

import java.io.IOException;

/**
 * @author bhuwan
 *
 */
// child class
// Thumb rule here is if the child class throws any exception then parent class must throw the same or parent class of the exception
// ie. if child class throws IOException then parent class method can throws IOException|Exception|Throwable
// this rule is only applicable for checked exception only
public class ExceptionDemo extends ExceptionClass {

    @Override
    public void m1() throws VirtualMachineError {

    }

    public void m2() throws IOException {

    }

    public void m3() throws IOException {

    }

    public void m4() throws Exception {

    }
}

// parent class
class ExceptionClass {

    public void m1() throws OutOfMemoryError {

    }

    public void m2() throws Exception {

    }

    public void m3() throws IOException {

    }

    public void m4() throws Throwable {

    }
}