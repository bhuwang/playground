/**
 * 
 */
package com.bhuwan.java.basics.playground;

/**
 * @author bhuwan
 *
 */
public class IntegerArrayIncrement {

    public static int[] arrayIncrement(int[] numbers) {

        String stringValue = "";
        for (int number : numbers) {
            stringValue += number;
        }
        Integer intValue = Integer.valueOf(stringValue);
        intValue++;
        System.out.println("intValue: " + intValue);
        String newStringValue = String.valueOf(intValue);
        int[] newIntArray = new int[newStringValue.length()];
        for (int i = 0; i < stringValue.length(); i++) {
            newIntArray[i] = Integer.valueOf(String.valueOf(newStringValue.charAt(i)));
        }
        return newIntArray;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 9 };
        int[] newArrayAfterIncrement = IntegerArrayIncrement.arrayIncrementV3(numbers);
        for (int number : newArrayAfterIncrement) {
            System.out.println("number: " + number);
        }

    }

    public static int[] arrayIncrementV2(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                if (numbers[i] == 9) {
                    numbers[i] = 0;
                } else {
                    numbers[i] = numbers[i] + 1;
                }
            }
        }
        return numbers;
    }

    public static int[] arrayIncrementV3(int[] numbers) {
        int lastItemIndex = numbers.length - 1;
        if (numbers[lastItemIndex] == 9) {
            numbers[lastItemIndex] = 0;
        } else {
            numbers[lastItemIndex] = ++numbers[lastItemIndex];
        }
        return numbers;
    }
}
