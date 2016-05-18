/**
 * 
 */
package com.bhuwan.java.basics.abstractclass;

/**
 * @author bhuwan
 */
public abstract class Animal implements Species {
    String name;

    public abstract String getSound();

    public String getName() {
        return name;
    }

    public Animal() {
    }
}
