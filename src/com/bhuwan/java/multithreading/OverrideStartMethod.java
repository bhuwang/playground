/**
 * 
 */
package com.bhuwan.java.multithreading;

/**
 * @author bhuwan
 *
 */
public class OverrideStartMethod extends Thread {

    /**
     * @param args
     */
    public static void main(String[] args) {
        OverrideStartMethod thread = new OverrideStartMethod();
        thread.start();
        System.out.println("Main method ends!");
    }

    /**
     * Since we have override start method, new thread won't be created and run method will be invoked. Start method will behave like a
     * normal method in this case. It is not recommended to override start() method.
     * 
     * @author bhuwan
     */
    @Override
    public synchronized void start() {
        // if you really add something then you can call super.start() and your own implementation inside start() method.
        // super.start();
        System.out.println("Overriding Thread.start() method.");
    }

    @Override
    public void run() {
        System.out.println("Overriding Thread.run() method.");
    }

}
