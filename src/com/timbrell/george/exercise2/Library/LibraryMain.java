package com.timbrell.george.exercise2.Library;

import java.util.Date;

public class LibraryMain {
    public static void main(String[] args) {
        Date birthday = new Date(1995, 5, 12);
        Person person = new Person("bob", 27, birthday);

        Collection collection = new Collection();
        Book testBook =  new Book("J D Salinger", "Catcher in the rye", "fiction", 150);
        Book newBook = new Book("Charles Dickens","Tale of two cities", "ficton", 400);
        collection.addItem(testBook);
        collection.addItem(newBook);

        FileIO io = new FileIO();

        io.writeToFile(collection);

    }
}
