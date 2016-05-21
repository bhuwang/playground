package com.bhuwan.java.basics.oop.constructor;

public class UserDefinedConstructor {

}

class ConstructorOverloadingDemo {
    // define zero argument constructor
    public ConstructorOverloadingDemo() {
    }

    // parameterized constructor
    public ConstructorOverloadingDemo(int a) {
    }

    public ConstructorOverloadingDemo(Integer a) {
    }

    public ConstructorOverloadingDemo(Integer a, String b) {
    }

    public ConstructorOverloadingDemo(String a, Integer b) {
    }

}

class DefaultConstructorClass {
    /*
     * if the user do not define any constructor compiler will automatically provide the default zero argument constructor.
     */
}
