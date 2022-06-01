package com.ro;

import java.io.IOException;
import java.nio.file.Path;

public interface Encoding {
    Path codeString(Path pathIn, int key) throws IOException;

    String decodeString(Path pathOut, int key) throws IOException;

    void bruteForce(Path path);

    String getCeasarLetter(String letterRus, int key);

}
