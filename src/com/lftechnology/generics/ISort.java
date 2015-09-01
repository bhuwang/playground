/**
 * 
 */
package com.lftechnology.generics;

import java.util.List;

/**
 * @author bhuwan
 */
public interface ISort {

    // By using raw type
    @SuppressWarnings("rawtypes")
    public List sort(final List aList);

}
