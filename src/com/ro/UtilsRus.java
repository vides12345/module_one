package com.ro;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class UtilsRus {
    static Map<Integer, String> fillMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "а");
        map.put(2, "б");
        map.put(3, "в");
        map.put(4, "г");
        map.put(5, "д");
        map.put(6, "е");
        map.put(7, "ё");
        map.put(8, "ж");
        map.put(9, "з");
        map.put(10, "и");
        map.put(11, "й");
        map.put(12, "к");
        map.put(13, "л");
        map.put(14, "м");
        map.put(15, "н");
        map.put(16, "о");
        map.put(17, "п");
        map.put(18, "р");
        map.put(19, "с");
        map.put(20, "т");
        map.put(21, "у");
        map.put(22, "ф");
        map.put(23, "х");
        map.put(24, "ц");
        map.put(25, "ч");
        map.put(26, "ш");
        map.put(27, "щ");
        map.put(28, "ъ");
        map.put(29, "ы");
        map.put(30, "ь");
        map.put(31, "э");
        map.put(32, "ю");
        map.put(33, "я");
        map.put(34, ".");
        map.put(35, ",");
        map.put(36, "\"");
        map.put(37, ":");
        map.put(38, "!");
        map.put(39, " ");
        map.put(40, "?");
        return map;
    }


    static void print(String s) {
        PrintStream ps = new PrintStream(System.out, true, StandardCharsets.UTF_8);
        ps.println(s);
    }
}
