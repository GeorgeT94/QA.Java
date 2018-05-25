package com.timbrell.george.level3.Hashmaps;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Parser myParser = new Parser();
        Sorter sorter = new Sorter();
        Hash hash = new Hash();
        HashMap sortedMap = new HashMap<String, ArrayList<String>>();
        File wordFile = new File("./anagramWords.txt");
        ArrayList<String> wordList;

        wordList = myParser.fileToArray(wordFile);

        sortedMap = hash.stringArrayToHashBySorted(wordList);
        hash.mostAnagrams(sortedMap);

    }
}
