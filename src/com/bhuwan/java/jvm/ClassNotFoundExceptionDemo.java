/**
 * 
 */
package com.bhuwan.java.jvm;

/**
 * @author bhuwan
 *
 */
public class ClassNotFoundExceptionDemo {

    /**
     * Here I am trying to load the class which is never exist.
     * 
     * @param args
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> class1 = Class.forName("com.bhuwan.java.JptClassName");
    }

}
