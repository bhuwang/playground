/**
 * 
 */
package com.lftechnology.generics;

/**
 * @author bhuwan
 */
public class GenericsAndInheritance {
    public static void main(String[] args) {
        String name = "Bhuwan";
        Object nameObject = new Object();
        nameObject = name;
        
        GenericsType<String> nameString = new GenericsType<String>();
        GenericsType<Object> object = new GenericsType<Object>();
        // this is not same with generic
        //object = nameString;
        
    }
}
