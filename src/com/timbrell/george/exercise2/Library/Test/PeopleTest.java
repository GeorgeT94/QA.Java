package com.timbrell.george.exercise2.Library.Test;

import com.timbrell.george.exercise2.Library.People;
import com.timbrell.george.exercise2.Library.Person;
import org.junit.Test;

import java.util.Date;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PeopleTest {

    //Person Class tests
    @Test
    public void registerTest() {
        Date dob = new Date(1994, 5, 1);
        Person testPerson = new Person("name", 17,dob);

        People people = new People();
        people.register(testPerson);

        assertEquals(1, people.getSize());
    }

    @Test
    public void testPersonSetters() {

    }

}
