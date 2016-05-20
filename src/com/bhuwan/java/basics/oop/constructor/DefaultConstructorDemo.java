/**
 * 
 */
package com.bhuwan.java.basics.oop.constructor;

/**
 * @author bhuwan
 *
 */
public class DefaultConstructorDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        DefaultConstructorDemo con = new DefaultConstructorDemo();
        con.m1();

    }

    public void m1() {
        System.out.println("Default constructor example.");
    }

}

class DefaultDemo {

    public DefaultDemo(String hello) {
    }

    // see the result by comment this default constructor
    public DefaultDemo() {
    }
}

class DefaultDemo2 extends DefaultDemo {

}
