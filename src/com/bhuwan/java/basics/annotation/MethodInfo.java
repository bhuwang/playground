/**
 * 
 */
package com.bhuwan.java.basics.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author bhuwan
 */
@Inherited
@Documented
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author();

    String date() default "mm/dd/yyyy";

    String comments();

    int revision();
}
