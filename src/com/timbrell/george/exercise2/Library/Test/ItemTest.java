package com.timbrell.george.exercise2.Library.Test;

import com.timbrell.george.exercise2.Library.Book;
import com.timbrell.george.exercise2.Library.Collection;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    @Test
    public void testGetName(){
        Book testBook =  new Book("J D Salinger", "Catcher in the rye", "fiction", 150);

        assertEquals("Catcher in the rye", testBook.getName());
    }
}
