package com.codecool.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilePartReaderTest {
    @Test
    public void toLineIsSmallarThanFromLineThrowsException() {
        FilePartReader filePartReader = new FilePartReader();
        assertThrows(IllegalArgumentException.class, ()-> {
            filePartReader.setup("/home/kruppa/codecool/oop/5SI/filepartreader-testing-with-junit-kruppatomi/src/com/codecool/text/readtThis.txt",3,2);
        });
    }

}