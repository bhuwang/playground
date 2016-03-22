/**
 * 
 */
package com.bhuwan.java.jvm.garbagecollection;

/**
 * @author bhuwan
 *
 */
public class UsingRuntimeClassDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("initial total memory: " + runtime.totalMemory());
        System.out.println("initial free memory: " + runtime.freeMemory());
        for (int i = 0; i < 100000; i++) {
            String name = new String("Bhuwan" + i);
            name = null;
        }
        System.out.println("final total memory: " + runtime.totalMemory());
        Runtime.getRuntime().gc();
        System.out.println("final free memory: " + runtime.freeMemory());
    }

}
