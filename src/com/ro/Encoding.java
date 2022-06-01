package com.ro;

import java.io.IOException;
import java.nio.file.Path;

public interface Encoding {
    void CodeString(Path pathIn, int key) throws IOException;

    void DecodeString(Path pathOut, int key) throws IOException;

    void bruteForce(Path path);

    String getCeasarLetter(String letterRus, int key);

}
