/**
 * 
 */
package com.lftechnology.java.basics.annotation;


/**
 * @author bhuwan
 */
public @interface MethodInfo {
    String author();
    String date() default "mm/dd/yyyy";
    String comments();
    int revision();
}
