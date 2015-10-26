/**
 * 
 */
package com.bhuwan.java.basics.finaldemo;

/**
 * @author bhuwan
 *
 */
public class FinalDemo {
    public static void main(String[] args) {
        final String name = "Bhuwan";
        print(name);
    }
    
    public static void print(String name){
        name = "gautam";
       System.out.println(name);
    }
    
}
