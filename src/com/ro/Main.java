package com.ro;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static HashMap<Integer, String> map = (HashMap<Integer, String>) UtilsRus.fillMap();
    static String toCode;
    static String deCode;
    public static void main(String[] args) throws IOException {
        CodeDecode decode = new CodeDecode();
        //Reading a  File
        Path  filePath = Path.of("textIn");
        decode.CodeString(filePath, 3);

//        Arrays.toString();
//        toCode = Files.readString(Path.of(filePath));
//        print(toCode);
//        String coded = code(toCode, 3);
//        print(coded);
//         deCode= decode(coded, -3);
//        Files.writeString(Path.of("textOut"), deCode);
//        print(deCode);
//        System.out.println(toCode.toLowerCase().equals(deCode));
//
//        System.out.println("***************************");
//        bruteForce(coded);
    }

    static void bruteForce(String textCoded) {
        char[] array = toCode.toLowerCase().toCharArray();
//        print(Arrays.toString(array));

        char[] chars = textCoded.toCharArray();
//        print(Arrays.toString(chars));

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

}
