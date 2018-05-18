package com.timbrell.george.exercise2.Library;

public abstract class Text extends LibraryItem implements Readable {
    private String author;
    private String title;
    private String genre;
    private int pageCount;

    public Text(String author, String title, String genre, int pageCount) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.pageCount = pageCount;
    }
}
