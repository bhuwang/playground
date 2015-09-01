/**
 * 
 */
package com.lftechnology.java.basics.array;

import java.util.Arrays;

/**
 * @author bhuwan
 */
public class JavaArrayDemo {

    public static void main(String args[]) {
        int marks[] = { 98, 95, 91, 93, 97 };
        // java array iteration using enhanced for loop
        int i = 0;
        // trying to add incompatible value
        for (int value : marks) {
            System.out.println("Array [" + i + "] : " + value);
            i++;
        }
        
        // Before Sort
        System.out.println();
        System.out.println("Before Sort: "+ Arrays.toString(marks));
        Arrays.sort(marks);
        System.out.println("After Sort: "+ Arrays.toString(marks));
        System.out.println();
        
        // Copy Array
        int newMarks[] = Arrays.copyOf(marks, marks.length);
        System.out.println("After copy: "+ Arrays.toString(newMarks));
        System.out.println();
        
        int newMarksTwo[] = new int[5];
        System.arraycopy(marks, 0, newMarksTwo, 0, marks.length);
        System.out.println("After Second Copy: "+ Arrays.toString(newMarks));
        System.out.println();
        
        int[] fruits = new int[5];
        fruits[0] = 10;
        fruits[1] = 122;
        fruits[2] = 1662;
        fruits[3] = 142;

        // Multi-Dimensional Array
        int sudoku[][] = { { 2, 1, 3 }, { 1, 3, 2 }, { 3, 2, 1 } };
        
        for(int fruit : fruits){
            System.out.println(fruit+" :Fruits");
        }

        for (int row = 0; row < sudoku.length; row++) {
            for (int col = 0; col < sudoku[row].length; col++) {
                int value = sudoku[row][col];
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
