package com.timbrell.george.exercise2;

public class People {
    private String name;
    private int age;
    private String jobTitle;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setJob(String job){
        this.jobTitle = job;
    }
    public String getJob(){
        return this.jobTitle;
    }
    public void setAge(int age){
        this.age = age;
    }
    public People(String name, int age, String jobTitle ){
        this.setName(name);
        this.setAge(age);
        this.setJob(jobTitle);
    }

    @Override
    public String toString() {
        String returnStatement = "";
        returnStatement += this.name + ", ";
        returnStatement += this.age + ", ";
        returnStatement += this.jobTitle;
        return returnStatement;
    }

    public static <T> void outPutArray(T[] inputArray){
        for(T element : inputArray){
            System.out.println(element);
        }
    }
    public static void searchName(String name, People[] inputArray){
        boolean nameExists = false;

        for(People element : inputArray){
            if(element.getName() == name){
                System.out.println("Name found! : " + element);
                nameExists = true;
            }
        }
        if(!nameExists){
            System.out.println("Name not in array");
        }
    }
    public static void main(String[] args) {
        People Jeff = new People("Jeff",22,"DJ");
        People Sam = new People("Sam",21,"Trainee consultant");
        People Bob = new People("Bob",40,"Builder");

        People[] peopleArray = new People[3];
        peopleArray[0] = Jeff;
        peopleArray[1] = Sam;
        peopleArray[2] = Bob;
        //outPutArray(peopleArray);
        searchName("Jef", peopleArray);
    }
}

