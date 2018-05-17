package com.timbrell.george.exercise2.Files;

import java.io.File;
import java.util.ArrayList;

public class FilesMain {
    public static void main(String[] args) {
        ArrayList<Person> group = new ArrayList<Person>();

        Person jeff = new Person("jeff", "doctor", 60);
        Person bill = new Person("bill", "fireman", 20);
        Person phil = new Person("phil", "builder", 32);
        Person will = new Person("will", "vet", 55);
        Person james = new Person("james", "lawyer", 21);

        group.add(jeff);
        group.add(bill);
        group.add(phil);
        group.add(will);
        group.add(james);


        PersonIO io = new PersonIO();
        File peopleTXT = new File("./people.txt");

        //io.write(group);
        String contentString = io.read(peopleTXT);

        Parser myParser = new Parser();
        ArrayList<Person> emptyGroup = myParser.stringToArrayList(contentString);

        System.out.println(emptyGroup);
    }
}
