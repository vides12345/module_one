package com.ro;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

public class Main {
        public static void main(String[] args) throws IOException {
            CodeDecode codeDecode = new CodeDecode();
            Path filePath = Path.of("textIn");
            Path codeString = codeDecode.codeString(filePath, 3);
            codeDecode.decodeString(codeString, -3);
        }
}
