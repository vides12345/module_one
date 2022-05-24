package com.ro;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static HashMap<Integer, String> map = fillMap(new HashMap<>());
    static String toCode;
    static String deCode;
    public static void main(String[] args) throws IOException {
        String filePath = "textIn";
        toCode = Files.readString(Path.of(filePath));
        print(toCode);
        String coded = code(toCode, 3);
        print(coded);
         deCode= decode(coded, -3);
        Files.writeString(Path.of("textOut"), deCode);
        print(deCode);
        System.out.println(toCode.toLowerCase().equals(deCode));

        System.out.println("***************************");
//        bruteForce(coded);
    }

    static void bruteForce(String textCoded) {
        char[] array = toCode.toLowerCase().toCharArray();
        print(Arrays.toString(array));

        char[] chars = textCoded.toCharArray();
        print(Arrays.toString(chars));

        boolean isDecoded = false;
        while (!isDecoded) {
            for (int i = 1; i <= map.size(); i++) {
                for (int j = 0; j < array.length; j++) {
                    
                }
            }
        }
    }
//coding a text using Ceasar codes
    static String code(String textIn, int key) {
        char[] chars = textIn.toLowerCase().toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char aChar : chars) {
            if (map.containsValue(String.valueOf(aChar))) {
                builder.append(getCeasarLetter(String.valueOf(aChar), key));
            } else builder.append(aChar);
        }
        return new String(builder);
    }
//decoding a text
    static String decode(String textOut, int key) {
        char[] chars = textOut.toLowerCase().toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char aChar : chars) {
            if (map.containsValue(String.valueOf(aChar))) {
                builder.append(getCeasarLetter(String.valueOf(aChar), key));
            } else builder.append(aChar);
        }
        return new String(builder);
    }
//Getting Ceasar codes of letter with key displacement
    private static String getCeasarLetter(String letterRus, int key) {
        if (map.containsValue(letterRus)) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().equals(letterRus)) {
                    int index = (map.size() + entry.getKey() + key) % map.size();
                    return map.get(index);
                }
            }
        }
        return letterRus;
    }
//filling Russian letters to map

    private static HashMap<Integer, String> fillMap(HashMap<Integer, String> map) {
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
//print Russian letters on UTF
    static void print(String s) {
        PrintStream ps = new PrintStream(System.out, true, StandardCharsets.UTF_8);
        ps.println(s);
    }
}
