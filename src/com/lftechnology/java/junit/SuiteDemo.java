/**
 * 
 */
package com.lftechnology.java.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author bhuwan
 *
 */
@RunWith(Suite.class)
@SuiteClasses({BeforeClassAndAfterClass.class, UsingBeforeAndAfter.class})
public class SuiteDemo {

}
