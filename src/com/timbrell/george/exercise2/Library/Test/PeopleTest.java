package com.timbrell.george.exercise2.Library.Test;

import com.timbrell.george.exercise2.Library.People;
import com.timbrell.george.exercise2.Library.Person;
import org.junit.Test;

import java.util.Date;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PeopleTest {

    //Person Class tests
    @Test
    public void personNotNull(){
        Date dob = new Date(1994, 5, 1);
        Person testPerson = new Person("name", 17,dob);
        assertNotNull(testPerson);
    }
    @Test
    public void registerTest() {
        Date dob = new Date(1994, 5, 1);
        Person testPerson = new Person("name", 17,dob);

        People people = new People();
        people.register(testPerson);

        assertEquals(1, people.getSize());
    }

    @Test
    public void testDelete() {
        Date dob = new Date(1994, 5, 1);
        Person testPerson = new Person("name", 17,dob);
        People people = new People();
        people.register(testPerson);
        people.delete(testPerson);
        assertEquals(0, people.getSize());

    }

    @Test
    public void testUpdateName(){
        Date dob = new Date(1994, 5, 1);
        Person testPerson = new Person("name", 17,dob);
        People people = new People();
        people.register(testPerson);
        people.update(testPerson, "new name");
        assertEquals("new name", testPerson.getName());
    }
    @Test
    public void testDOB(){
        Date dob = new Date(1994, 5, 1);
        Person testPerson = new Person("name", 17,dob);
        Date newDOB = new Date(1995, 4, 2);
        People people = new People();
        people.register(testPerson);
        people.updateDateOfBirth(testPerson, newDOB);
        assertEquals(newDOB, testPerson.getDateOfBirth());
    }
}
