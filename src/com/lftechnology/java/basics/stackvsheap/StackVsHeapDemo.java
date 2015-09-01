/**
 * 
 */
package com.lftechnology.java.basics.stackvsheap;

/**
 * @author bhuwan
 *
 */
public class StackVsHeapDemo {
    public static void main(String[] args) { 
        int i=15; 
        Object obj = new Object(); 
        StackVsHeapDemo demo = new StackVsHeapDemo(); 
        demo.methodA(obj); 
    } 
 
    private void methodA(Object param) { 
        String name = param.toString(); 
        System.out.println(name);
    } 

}
