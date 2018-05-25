package com.timbrell.george.exercise2.Library;

public class Book extends Text{


    public Book(String author, String title, String genre, int pageCount) {
        super( author, title, genre, pageCount);


    }

    @Override
    public String getName() {
        return this.getTitle();
    }
}
