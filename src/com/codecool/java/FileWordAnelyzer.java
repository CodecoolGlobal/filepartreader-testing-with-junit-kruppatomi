package com.codecool.java;

import com.codecool.java.FilePartReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileWordAnelyzer {

    private FilePartReader filePartReader;

    public FileWordAnelyzer() {
        filePartReader = new FilePartReader();

    }

    public List getWordsOrderedAlphabetically (){
        String resorce = filePartReader.readLines (0,5);
        List<String> list = new ArrayList<String>(Arrays.asList(resorce.split(" ujsor ")));
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        return list;
        //returns the words ordered by alphabetically as an ArrayList
    }

    public List getWordsContainingSubstring (String subString ){
        String resorce = filePartReader.readLines (0,5);
        List<String> newList = new ArrayList<>();
        List<String> list = new ArrayList<String>(Arrays.asList(resorce.split(" ujsor ")));
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).contains("subString")){
                newList.add(list.get(i));
            }
        }
        return newList;
        //returns the words which contains the subString
    }

/** PALINDROME!!!!!!!!!!!!!!! DON'T FORGET TO FILL THIS PART OUT!!
    public List getStringsWhichPalindromes (){
        FilePartReader filePartReader = new FilePartReader();
        filePartReader.readLines ();
        //returns the words from the String which are palindrome
    }
**/
public static void main(String[] args){
}
}

