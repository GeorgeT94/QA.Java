package com.timbrell.george.exercise2.Files;

public class Person {
    private String name;
    private String occupation;
    private int age;

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, String job, int age){
        this.name = name;
        this.occupation = job;
        this.age = age;
    }

    @Override
    public String toString() {
        String outputStr = "";
        outputStr += this.name + " " + this.occupation + " " + this.age + "";
        return outputStr;
    }
}
