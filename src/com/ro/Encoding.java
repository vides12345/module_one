package com.ro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;

public interface Encoding {
    void CodeString(Path pathIn, int key) throws IOException;

    void DecodeString(Path pathOut, int key) throws IOException;

    void bruteForce(InputStream inStream, OutputStream outStream);

    String getCeasarLetter(String letterRus, int key);

}
