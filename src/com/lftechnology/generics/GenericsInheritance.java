/**
 * 
 */
package com.lftechnology.generics;

/**
 * @author bhuwan
 */
public class GenericsInheritance {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String str = "GenericsInheritance";
        Object obj = new Object();
        // works because String is-a Object, inheritance in java
        obj = str;

        MyClass<String> myClass1 = new MyClass<String>();
        MyClass<Object> myClass2 = new MyClass<Object>();
        // compilation error since MyClass<String> is not
        //myClass2 = myClass1;
        // MyClass<T> parent is Object
        obj = myClass1;
    }

    public static class MyClass<T> {
    }

}
