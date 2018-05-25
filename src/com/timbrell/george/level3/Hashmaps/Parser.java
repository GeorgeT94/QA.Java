package com.timbrell.george.level3.Hashmaps;

import java.io.*;
import java.util.ArrayList;

public class Parser {

    public ArrayList<String> fileToArray(File wordFile){
        ArrayList<String> wordList = new ArrayList<String>();

        // The name of the file to open.


        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(wordFile);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                wordList.add(line);
            }

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                           wordFile.getName() + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + wordFile.getName() + "'");

        }
        return wordList;
    }

    public void printArrayList(ArrayList<String> arrayList){
        for(int i = 0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }

}
