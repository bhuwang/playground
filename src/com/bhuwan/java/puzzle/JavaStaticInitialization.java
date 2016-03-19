/**
 * 
 */
package com.bhuwan.java.puzzle;

/**
 * @author bhuwan
 *
 */
class JavaStaticInitialization {
    public static void main(String[] args) {
        StaticNullTest staticClassObject = null;
        staticClassObject.staticMethod();
    }
    
}

class StaticNullTest{
    public static void staticMethod(){
        System.out.println("Static method invoked!");
    }
}
