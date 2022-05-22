package com.ro;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static HashMap<Integer,String> map;


    static {
        try {
            map = fillMap(new HashMap<>());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
//        String s = getCeasarLetter("т", 2);
        String toCode ="аб@&$вгдабвгдabcd$вгдабвгдabc$вгд$вгдабвгдabcdабвгдab$вгдабвгдabcdcdd";
        print(toCode);
        System.out.println();
        String code = code(toCode, 3);
        print(code);
        String decode = decode(code, -3);
        print(decode);
        System.out.println(toCode.equals(decode));

    }

    static String code(String textIn, int key) {
        char[] chars = textIn.toLowerCase().toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsValue(String.valueOf(chars[i]))) {
                builder = builder.append(getCeasarLetter(String.valueOf(chars[i]), key));
            } else builder.append(String.valueOf(chars[i]));
        }
        return new String(builder);
    }

    static String decode(String textOut, int key) {
        char[] chars = textOut.toLowerCase().toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsValue(String.valueOf(chars[i]))) {
                builder = builder.append(getCeasarLetter(String.valueOf(chars[i]), key));
            } else builder.append(String.valueOf(chars[i]));
        }
        return new String(builder);
    }

    private static String getCeasarLetter(String s, int key) {

        if (map.containsValue(s)) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().equals(s)) {
                    int index = (entry.getKey() + key)%map.size();
//                    System.out.println(index);
                    return map.get(index);
                }
            }
        }
        return s;
    }
    private static HashMap<Integer, String> fillMap(HashMap<Integer, String> map) throws UnsupportedEncodingException {
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
        map.put(31, "ь");
        map.put(32, "э");
        map.put(33, "ю");
        map.put(34, "я");
        map.put(35, ".");
        map.put(36, ",");
        map.put(37, "\"");
        map.put(38, ":");
        map.put(39, "!");
        map.put(40, "?");
        map.put(41, " ");

//        for (String value : map.values()) {
//            PrintStream ps = new PrintStream(System.out, true, "UTF-8");
//            ps.println(value);
//
//        }
        return map;
    }

    static void print(String s) throws UnsupportedEncodingException {
        PrintStream ps = new PrintStream(System.out, true, "UTF-8");
        ps.println(s);
    }
}
