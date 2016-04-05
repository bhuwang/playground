/**
 * 
 */
package com.bhuwan.java.locale;

import java.util.Locale;

/**
 * @author bhuwan
 *
 */
public class LocaleDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Locale l1 = Locale.getDefault();
        System.out.println("Default language: " + l1.getLanguage() + " Display Name: " + l1.getDisplayLanguage());
        System.out.println("Default Country: " + l1.getCountry() + " Display Name: " + l1.getDisplayCountry());
        Locale nepali = new Locale("ne", "NP");
        Locale.setDefault(nepali);
        System.out.println(
                "Default language: " + Locale.getDefault().getLanguage() + " Display Name: " + Locale.getDefault().getDisplayLanguage());
        System.out.println(
                "Default Country: " + Locale.getDefault().getCountry() + " Display Name: " + Locale.getDefault().getDisplayCountry());

        System.out.println();
        System.out.println("Printing ISO country list......");
        String[] isoCountries = Locale.getISOCountries();
        for (String country : isoCountries) {
            System.out.print(country + " ");
        }

        System.out.println();
        System.out.println("Printing ISO language list......");
        String[] isoLanguage = Locale.getISOLanguages();
        for (String language : isoLanguage) {
            System.out.print(language + " ");
        }

        System.out.println();
        System.out.println("Printing locale list......");
        Locale[] locales = Locale.getAvailableLocales();
        for (Locale locale : locales) {
            System.out.print(locale.getDisplayCountry() + "-" + locale.getDisplayLanguage() + " ");
        }
    }

}
