/**
 * 
 */
package com.bhuwan.java.basics.createobject;

/**
 * @author bhuwan
 *
 */
public class NewInstanceDemo {

    /**
     * @param args
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Object newInstance = Class.forName(args[0]).newInstance();
        System.out.println("Object created for : " + newInstance.getClass().getName());
    }

}

class Student {

}

class Teacher {

}
