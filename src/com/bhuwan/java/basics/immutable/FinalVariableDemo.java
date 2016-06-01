/**
 * 
 */
package com.bhuwan.java.basics.immutable;

/**
 * @author bhuwan
 *
 */
public class FinalVariableDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        final StringBuffer name = new StringBuffer("Bhuwan");
        System.out.println(name);
        name.append(" Gautam");
        System.out.println(name);
        // if you try to reassign then the compiler is gonna throw compiletime error.
        // name = new StringBuffer("Prisha Gauatm");

    }

}
