package com.timbrell.george.exercise2.Library;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    private String FILENAME = "./libraryList.txt";

    public void writeToFile(Collection library) {


        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            String content = library.getReadablelist();

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

    public void readFronFile(){

    }
}


