/**
 * 
 */
package com.bhuwan.java.basics.typecast;

/**
 * @author bhuwan
 *
 */
public class TypeCastDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Parent class reference can be used to hold child object
        ParentT p = new ChildT();

        // interface reference can be used to hold implemented class object.
        Runnable runnable = new Thread();

        /*
         * Syntax:
         * 
         * A b = (C) d;
         * 
         * A = class/interface
         * 
         * b = reference variable
         * 
         * C = class/interface
         * 
         * d = Object reference/Object
         * 
         * (C & d) && (A & C) must be of same or reference type.
         */

        Object o = new String("Bhuwan");
        StringBuffer b = (StringBuffer) o;
        System.out.println(b);
    }

}

class ParentT {
    public void p() {
        System.out.println("Parent method.");
    }
}

class ChildT extends ParentT {
    public void c() {
        System.out.println("Child method.");
    }
}
