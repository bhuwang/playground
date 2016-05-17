/**
 * 
 */
package com.bhuwan.java.multithreading;

/**
 * @author bhuwan
 *
 */
public class ThreadWithoutRunOverridding extends Thread {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ThreadWithoutRunOverridding thread = new ThreadWithoutRunOverridding();
        // Nothing gonna happen since we have not overridding run() method. There is no use of thread in this case.
        thread.start();
    }

}
