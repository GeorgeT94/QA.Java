package com.timbrell.george.exercise2.Library.Test;

import com.timbrell.george.exercise2.Library.Person;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    //Person Class tests
    @Test
    public void testPersonGetters() {
        Date dob = new Date(1994, 5, 1);
        Person testPerson = new Person("name", 17,dob);

        assertEquals(dob, testPerson.getDateOfBirth());
        assertEquals("name", testPerson.getName());
        assertEquals(17, testPerson.getAge());
    }

    @Test
    public void testPersonSetters() {
        Date dob = new Date(1994, 5, 1);
        Person testPerson = new Person("name", 17,dob);

        Date newDOB = new Date(1994, 6, 10);
        testPerson.setDateOfBirth(newDOB);
        assertEquals(newDOB,testPerson.getDateOfBirth() );
        assertEquals("name", testPerson.getName());
        assertEquals(17, testPerson.getAge());
    }

}
