/**
 * 
 */
package com.bhuwan.java.basics.oop.overriding;

/**
 * @author bhuwan
 *
 */
public class ScopeInOverrriding extends Scope {

    // you cannot reduce the visibility of the overriden method.
   /* void m1() {
    }*/
    
    @Override
    public void m2() {
    }
}

class Scope {
    public void m1() {

    }
    
    protected void m2(){
        
    }
}