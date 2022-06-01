package com.ro;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

public class Main {
        public static void main(String[] args) throws IOException {
            CodeDecode codeDecode = new CodeDecode();
            UtilsRus.print(codeDecode.getCeasarLetter(",", 3));
            Path filePath = Path.of("textIn");
            codeDecode.CodeString(filePath, 3);

            codeDecode.DecodeString(Path.of("dsdsd"),3);
        }
}
