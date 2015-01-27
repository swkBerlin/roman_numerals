package de.swkberlin.romans;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {

    static Map<Integer, String> numerals = new LinkedHashMap() {{
        put(1000, "M");
        put(500, "D");
        put(100, "C");
        put(50, "L");
        put(10, "X");
        put(5, "V");
        put(1, "I");
    }};


    static String result = "";

    public static String convert(int i) {
        result = "";
        for (Map.Entry<Integer, String> entry : numerals.entrySet()) {
            while (i >= entry.getKey()) {
                i -= entry.getKey();
                result += entry.getValue();
            }

            for (Map.Entry<Integer, String> subtractor : numerals.entrySet()) {
                if (subtractor.getKey().toString().startsWith("5"))
                    continue;
                i = minusSubtractor(i, entry, subtractor);
            }

        }

        return result;
    }

    private static int minusSubtractor(int i, Map.Entry<Integer, String> entry,
                                       Map.Entry<Integer, String> subtractor) {
        if (entry.getKey() > subtractor.getKey()) {
            if (i == entry.getKey() - subtractor.getKey()) {
                result += subtractor.getValue() + entry.getValue();
                i -= entry.getKey();
            }
        }
        return i;
    }
}
