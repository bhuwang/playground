package com.bhuwan.java.collection.concurrent;

/**
 * @author bhuwan
 * 
 *         <pre>
 * 
 * Traditional collections has following issues:
 * 
 * 1. Most[90%] of the collections objects are not thread safe which causes data inconsistency when multiple thread operate on the same
 * object on same time.
 * 
 * 2. Vector, Hashtable, Collection.synchronizedMap(), Collection.synchronizedSet(), Collection.synchronizedList() are thread safe. But the
 * problem with these objects is that only one thread can operate on one thread even for read operation. So performance wise these are not
 * up to the mark.
 * 
 * 3. ConcurrentModificationException is the biggest headache. While one thread iterating on collection object, the other thread not 
 * allowed to perform any modification.
 * 
 * There are mainly 3 concurrent classes:
 * 
 * 1. ConcurrentHashMap
 * 2. CopyOnWriteArrayList
 * 3. CopyOnWriteArraySet
 * 
 * 
 * 1. ConcurrentHashMap has three important methods:
 * 
 * a. putIfAbsent()
 * b. remove()
 * c. replace()
 * 
 *         </pre>
 */
