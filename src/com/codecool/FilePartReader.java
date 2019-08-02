package com.codecool;

public class FilePartReader {

    private String filePath;
    private Integer fromLine;
    private Integer toLine;

    public FilePartReader() {

    }

    public void setup(String filePath, Integer fromLine, Integer toLine) {

        if (toLine < fromLine) throw new IllegalArgumentException("toLine is cannot be lower than fromLine");
        else if (fromLine < 1) throw new IllegalArgumentException("fromLine cannot be lower than 1");

    }

    public String read(){
        return filePath;
    }
    //public String readLines() in the future this method will be this but before this i return void because without filling up this
    //it is not correct!!
    public void readLines(){
        //it will read the document from line to line with the metod read()
    }
}
