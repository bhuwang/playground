/**
 * 
 */
package com.bhuwan.java.basics.clone;

/**
 * @author bhuwan
 *
 */
public class Dog implements Cloneable {
    Cat c;
    int i;

    public Dog(Cat c, int i) {
        this.c = c;
        this.i = i;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
