package com.timbrell.george.exercise2.Library;

import java.util.ArrayList;
import java.util.Date;

public class People{
    public ArrayList<Person> people = new ArrayList<Person>();

    public void register(Person person){
        people.add(person);
    }

    public void delete(Person person){
        people.remove(person);
    }

    public int getSize(){
        return people.size();
    }

    public void update(Person person,String newName){
        Date dOb =  person.getDateOfBirth();
        String oldName = person.getName();

        int index = getIndex(oldName, dOb);

        if(index != -1) {
            person.setName(newName);
            people.set(index, person);
        }
    }


    public void updateDateOfBirth(Person person, Date newDate){
        Date dOb =  person.getDateOfBirth();
        String oldName = person.getName();

        int index = getIndex(oldName, dOb);

        if(index != -1) {
            person.setDateOfBirth(newDate);
            people.set(index, person);
        }
    }


    private int getIndex(String name, Date dateOfBirth){
        for(int i = 0; i < people.size(); i++){
            if(name.equals(people.get(i).getName()) && dateOfBirth == people.get(i).getDateOfBirth() ){
                return i;
            }
        }
        return -1;
    }
}
