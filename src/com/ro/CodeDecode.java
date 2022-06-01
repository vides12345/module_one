package com.ro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class CodeDecode implements Encoding {
    Map<Integer, String> map = UtilsRus.fillMap();
    @Override
    public void CodeString(Path path, int key) throws IOException {
        StringBuilder builder = new StringBuilder();
        List<String> list = Files.readAllLines(path);
        Path textOut1 = Files.createFile(Path.of("textOut1"));
        for (String textRaw : list) {
            for (int i = 0; i < textRaw.length(); i++) {
                char aChar = textRaw.charAt(i);
                if (map.containsValue(String.valueOf(aChar))) {
                    builder.append(getCeasarLetter(String.valueOf(aChar), key));
                } else builder.append(aChar);
            }
            Files.writeString(textOut1, new StringBuffer(builder));
        }
    }

    @Override
    public void DecodeString(Path path, int key) throws IOException {
        String string = Files.readString(path);
        StringBuilder builder = new StringBuilder();
        Path decodedFiles = Path.of("textDecoded");
        for (int i = 0; i < string.length(); i++) {
            char aChar = string.charAt(i);
            if (map.containsValue(String.valueOf(aChar))) {
                builder.append(getCeasarLetter(String.valueOf(aChar), key));
            } else builder.append(aChar);
        }
        Files.writeString(decodedFiles, new String(builder));
    }

    @Override
    public void bruteForce(Path path) {

    }

    @Override
    //Getting Ceasar codes of letter with key displacement
    public String getCeasarLetter(String letterRus, int key) {
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
