/**
 * 
 */
package com.bhuwan.java.multithreading;

/**
 * @author bhuwan
 *
 */
public class GetSetThreadName extends Thread{

    public static void main(String[] args) {
        System.out.println("Main Thread Name: "+ Thread.currentThread().getName());
        GetSetThreadName childThread = new GetSetThreadName();
        System.out.println("Child Thread Name: "+childThread.getName());
        Thread.currentThread().setName("XYZ Thread");
        System.out.println("Rename Main Thread Name: "+ Thread.currentThread().getName());
        int a = 10/0;
    }
}
