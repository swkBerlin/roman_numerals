package de.swkberlin.romans;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {

    static Map<Integer, String> numerals = new LinkedHashMap() {
        {
            put(1000, "M");
            put(900, "CM");
            put(500, "D");
            put(400, "CD");
            put(100, "C");
            put(90, "XC");
            put(50, "L");
            put(40, "XL");
            put(10, "X");
            put(9, "IX");
            put(5, "V");
            put(4, "IV");
            put(1, "I");
        }
    };

    static String result = "";

    public static String convert(int i) {
        result = "";
        for (Map.Entry<Integer, String> entry : numerals.entrySet()) {
            while (i >= entry.getKey()) {
                i -= entry.getKey();
                result += entry.getValue();
            }
        }
        return result;
    }
}