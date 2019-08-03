package com.codecool.java;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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

    /** private static String readLineByLineJava8(String filePath)
     {
     StringBuilder contentBuilder = new StringBuilder();
     try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8))
     {
     stream.forEach(s -> contentBuilder.append(s).append("\n"));
     }
     catch (IOException e)
     {
     e.printStackTrace();
     }
     return contentBuilder.toString();
     }
     **/

    public String read(String filePath){
        ArrayList<String> lines = new ArrayList<String>();
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append(" ujsor "));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }

    //public String readLines() in the future this method will be this but before this i return void because without filling up this
    //it is not correct!!
    public String readLines(Integer fromLine, Integer toLine){
        StringBuilder contentBuilder = new StringBuilder();
        String string = read("/home/kruppa/codecool/oop/5SI/filepartreader-testing-with-junit-kruppatomi/src/com/codecool/text/readtThis.txt");
        List<String> list = new ArrayList<String>(Arrays.asList(string.split(" ujsor ")));
        //it will read the document from line to line with the metod read()
        for(int i = fromLine; i<toLine;i++){
            contentBuilder.append(list.get(i)).append(" ujsor ");
        }
        String newString = contentBuilder.toString();
        return newString;
    }
}
