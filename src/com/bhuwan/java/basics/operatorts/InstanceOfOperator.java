/**
 * 
 */
package com.bhuwan.java.basics.operatorts;

/**
 * @author bhuwan
 *
 */
public class InstanceOfOperator {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Short s = 15;
        Integer i = 10;
        Object n = "Bhuwan";
        Object o = 100;
        System.out.println(s instanceof Short);
        System.out.println(s instanceof Object);
        System.out.println(i instanceof Integer);
        System.out.println(i instanceof Number);
        System.out.println(i instanceof Object);

        // you can check parent object with child
        System.out.println(n instanceof Integer);
        System.out.println(o instanceof String);

        // null instance of Class/Interface always returns false
        System.out.println(null instanceof String);
        System.out.println(null instanceof Integer);
        // System.out.println(s instanceof Long);

    }

}
