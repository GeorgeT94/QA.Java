package com.timbrell.george.exercise2.Files;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;


public class PersonIO {
    public String arrayListToString(ArrayList<Person> people){
        String returnString = "";
        for(Person person: people){
            returnString += person;
        }

        return returnString;
    }

    public void write(ArrayList<Person> myList){
        final String FILENAME = "./people.txt";

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            String content = arrayListToString(myList);

            fw = new FileWriter(FILENAME);
            bw = new BufferedWriter(fw);
            bw.write(content);

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
    }
    public String read(File myfile){
        BufferedReader reader = null;
        String fileContent = "";
        try {
            File file = new File("./people.txt");
            reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                fileContent += line;
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return fileContent;
    }

}
