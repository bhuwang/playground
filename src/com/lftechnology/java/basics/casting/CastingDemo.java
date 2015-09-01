/**
 * 
 */
package com.lftechnology.java.basics.casting;

/**
 * @author bhuwan
 */
public class CastingDemo {
    public static void main(String[] args) {
        Integer one;
        Integer two = new Integer(2);

        // identity conversion
        one = two;
        // cast not required, if done compiler will not complain
        one = (Integer)two;
        System.out.println("one:: " + one + " two:: " + two);

        // Widening Conversion
        int i = 1234567890;
        float f = i;
        double dob = f;
        System.out.println("int:: " + i + " float:: " + f + " double:: " + dob);

        // Narrowing Conversions
        float ff = Integer.MAX_VALUE;
        long ll = (long)ff;
        int ii = (int)ff;

        System.out.println("float: " + ff + " long: " + ll + " int: " + ii);

        int jj = 255;
        byte bb = (byte)jj;
        char ccc = (char)jj;
        

        // size is too large and resulted in negative
        System.out.println("byte conversion: "+bb);
        System.out.println("Character Conversion: "+ccc);

        // Reference Conversion
        Integer integer = new Integer(10);
        Float floatt = new Float(20F);
        

        // this is not a cast - error
        //integer = floatt; //compiler error - incompatible types
        // integer = (Integer) floatt;//compiler error - inconvertible types
        Number number = floatt; // possible because Number is a super type for
                                // Float.

        // upcast - widening conversion
        Object obj = integer; // no explicit cast required
        System.out.println(obj);

        // downcast - narrowing conversion
        Integer in = (Integer)obj;// only subtype
        System.out.println(in);
        // Incompatible downcast
        Object name = "Bhuwan";
        Integer integ = (Integer)name;

        // downcast - Object to String
        // runtime issue - instance Object is not of String
        String str = (String)obj;// ClassCastException

        // String conversion;
        int iii = 10;
        String str1 = "";

        String str2 = str1 + iii; // string conversion

        // boxing and unboxing
        int iiii = 10;
        Integer iObj = new Integer(100);

        iObj = iiii;// boxing conversion
        iiii = iObj;// unboxing conversion

        // TODO: Unchecked and Capture Conversion

    }

}
