package com.timbrell.george.exercise2.Library;

public class Newspaper extends Text implements Readable{
    private String genre = "news";

    Newspaper(String publisher, String title, int pageCount){
        super(publisher, title, pageCount);
    }
}
