/**
 * 
 */
package com.bhuwan.java.generics;

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
        // object = nameString;

        InheritanceDemo3<String> abc = new InheritanceDemo3();
        InheritanceDemo3<Object> xyz = new InheritanceDemo3();
    }
}

// syntax one
class InheritanceDemo<T extends Number> {

}

// syntax two
class InheritanceDemo1<T extends Number & Comparable> {

}

// syntax three
class InheritanceDemo2<T extends Number & Comparable & Runnable> {

}

/**
 * syntax four
 * 
 * Below syntax will cause a compile time error because mutiple inheritance is not supported in java. Rule is same as inheritance.
 */
// class InheritanceDemo3<T extends Number & Object & Comparable & Runnable> {
// }

// syntax five
class InheritanceDemo3<T>{
    
}