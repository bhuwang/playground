/**
 * 
 */
package com.bhuwan.java.locale;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author bhuwan
 *
 */
public class NumberFormatDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        NumberFormatDemo demo = new NumberFormatDemo();
        Double number = 123456789.1235;
        System.out.println("UK: " + demo.returnLocalSpecificNumber(Locale.UK, number));
        System.out.println("US: " + demo.returnLocalSpecificNumber(Locale.US, number));
        System.out.println("France: " + demo.returnLocalSpecificNumber(Locale.FRANCE, number));
        System.out.println("Italy: " + demo.returnLocalSpecificNumber(Locale.ITALY, number));
        System.out.println("Germany: " + demo.returnLocalSpecificNumber(Locale.GERMAN, number));
        System.out.println("China: " + demo.returnLocalSpecificNumber(Locale.CHINA, number));
        Locale nepal = new Locale("ne", "NP");
        System.out.println("Nepal: " + demo.returnLocalSpecificNumber(nepal, number));
        Locale india = new Locale("pa", "IN");
        System.out.println("India: " + demo.returnLocalSpecificNumber(india, number));
    }

    public String returnLocalSpecificNumber(Locale locale, Number number) {
        //NumberFormat format = NumberFormat.getNumberInstance(locale);
        //NumberFormat format = NumberFormat.getInstance(locale);
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        return format.format(number);
    }

}
