package com.timbrell.george.exercise2.Library;

public class Map extends LibraryItem implements Readable{
    private int pageCount;
    Map(int pageCount){
        this.pageCount = pageCount;

    }

    @Override
    public int getPageCount() {
        return pageCount;
    }
}
