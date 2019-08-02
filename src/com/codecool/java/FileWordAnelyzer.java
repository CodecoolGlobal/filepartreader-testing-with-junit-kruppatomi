package com.codecool.java;

import com.codecool.java.FilePartReader;

import java.util.List;

public class FileWordAnelyzer {

    public FileWordAnelyzer(FilePartReader filePartReader) {

    }

    public List getWordsOrderedAlphabetically (){
        FilePartReader filePartReader = new FilePartReader();
        filePartReader.readLines ();
        //returns the words ordered by alphabetically as an ArrayList
    }

    public List getWordsContainingSubstring (String subString ){
        FilePartReader filePartReader = new FilePartReader();
        filePartReader.readLines ();
        //returns the words which contains the subString
    }

    public List getStringsWhichPalindromes (){
        FilePartReader filePartReader = new FilePartReader();
        filePartReader.readLines ();
        //returns the words from the String which are palindrome
    }

}
