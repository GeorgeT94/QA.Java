package com.timbrell.george.exercise2.Files;

import java.util.ArrayList;
import java.util.Arrays;

public class Parser {
    public String[][] stringTo2DStringArray(String contentString){

        String[] splitString = contentString.split(";");

        String[][] splitObjects = new String[splitString.length][];
        for(int i = 0; i < splitString.length; i++){
            splitObjects[i] =  splitString[i].split(",");
        }
        return splitObjects;
    }

    public Person arrayStringToObject(String[] myArray){

        String name = myArray[0];
        String job = myArray[1];
        int age = Integer.parseInt(myArray[2]);

        Person person = new Person(name, job, age);

        return person;
    }


    public ArrayList<Person> twoDArrayToObjArrayList(String[][] my2DArray){
        ArrayList<Person> people = new ArrayList<Person>();
        for(int i = 0; i< my2DArray.length; i++){
            people.add(arrayStringToObject(my2DArray[i]));
        }
        return people;
    }

    public ArrayList<Person> stringToArrayList(String stringToParse){

        String[][] my2dArray = stringTo2DStringArray(stringToParse);

        ArrayList<Person> peopleArray = twoDArrayToObjArrayList(my2dArray);

        return peopleArray;
    }


}
