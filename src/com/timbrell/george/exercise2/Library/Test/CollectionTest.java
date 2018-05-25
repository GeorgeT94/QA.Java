package com.timbrell.george.exercise2.Library.Test;

import com.timbrell.george.exercise2.Library.Book;
import com.timbrell.george.exercise2.Library.Collection;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class CollectionTest {
    @Test
    public void testAddItem(){
        Collection collection = new Collection();
        Book testBook =  new Book("J D Salinger", "Catcher in the rye", "fiction", 150);
        collection.addItem(testBook);
        assertEquals(1,collection.getSize());
    }

    @Test
    public void testRemoveItem(){
        Collection collection = new Collection();
        Book testBook =  new Book("J D Salinger", "Catcher in the rye", "fiction", 150);
        collection.addItem(testBook);
        collection.removeItem(testBook);

        assertEquals(0,collection.getSize());

    }

    @Test
    public void testCheckOut(){
        Book testBook =  new Book("J D Salinger", "Catcher in the rye", "fiction", 150);
        testBook.checkOut();
        assertEquals(true, testBook.isCheckedOut());
    }
    @Test
    public void testCheckIn(){
        Book testBook =  new Book("J D Salinger", "Catcher in the rye", "fiction", 150);
        testBook.checkOut();
        testBook.checkIn();
        assertEquals(false, testBook.isCheckedOut());
    }

    @Test
    public void testUpdateName(){
        Collection collection = new Collection();
        Book testBook =  new Book("J D Salinger", "Catcher in the rye", "fiction", 150);
        collection.addItem(testBook);

        collection.updateName(testBook, "The Catcher In The Rye");
        assertEquals("The Catcher In The Rye", testBook.getName());
    }

    @Test
    public void testUpdateDate(){
        Collection collection = new Collection();
        Book testBook =  new Book("J D Salinger", "Catcher in the rye", "fiction", 150);
        collection.addItem(testBook);
        Date newDate = new Date(1994, 3, 1);

        collection.updateDate(testBook, newDate );
        assertEquals(newDate, testBook.getDate());
    }

    @Test
    public void testGetId(){
        Collection collection = new Collection();
        Book testBook =  new Book("J D Salinger", "Catcher in the rye", "fiction", 150);
        Book newBook = new Book("Charles Dickens","Tale of two cities", "ficton", 400);
        collection.addItem(testBook);
        collection.addItem(newBook);

        assertEquals(1000000, testBook.getID());
        assertEquals(1000001, newBook.getID());
    }

    @Test
    public void testGetIndexBy(){
        Collection collection = new Collection();
        Book testBook =  new Book("J D Salinger", "Catcher in the rye", "fiction", 150);
        Book newBook = new Book("Charles Dickens","Tale of two cities", "ficton", 400);
        collection.addItem(testBook);
        collection.addItem(newBook);


        assertEquals(0, collection.getIndexByID(1000000));
        assertEquals(1, collection.getIndexByID(1000001));

    }
}
