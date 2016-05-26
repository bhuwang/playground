/**
 * 
 */
package com.bhuwan.java.basics.clone;

/**
 * @author bhuwan
 *
 */
public class CloneObjectDemo implements Cloneable {

    int i = 10;
    int j = 20;

    /**
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneObjectDemo c = new CloneObjectDemo();
        CloneObjectDemo c2 = (CloneObjectDemo) c.clone();
        c2.i = 50;
        c2.j = 60;
        System.out.println(c.i + " " + c.j);
    }

}
