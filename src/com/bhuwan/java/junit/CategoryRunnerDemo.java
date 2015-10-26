/**
 * 
 */
package com.bhuwan.java.junit;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author bhuwan
 *
 */
@RunWith(Categories.class)
@IncludeCategory(Mandatory.class)
@ExcludeCategory(Optional.class)
@SuiteClasses({BeforeClassAndAfterClass.class, ParameterizedDemo.class})
public class CategoryRunnerDemo {

}
