/**
 * 
 */
package com.bhuwan.java.jvm.garbagecollection;

/**
 * @author bhuwan
 *
 */
public class AutoGarbageStartDemo {

    static int count = 0;

    /**
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10000000; i++) {
            // try changing the value of i ranging from 1000 to 10000000 to see the result.
            // if there is a shortage of memory GC will automatically gets called.
            AutoGarbageStartDemo name = new AutoGarbageStartDemo();
            name = null;
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called " + ++count + " times.");
    }

}
