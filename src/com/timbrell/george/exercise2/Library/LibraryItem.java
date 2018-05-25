package com.timbrell.george.exercise2.Library;

import java.util.Date;

public abstract class LibraryItem {
    static int uniqueID = 1000000;

    private int ID;
    private String name;
    private Date date;
    private boolean checkedOut= false;

    LibraryItem(){
        setUniqueID();
    }

    public int getID() {
        return ID;
    }

    protected void setUniqueID(){
        ID = createID();
    }

    protected int createID(){
        return uniqueID++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isCheckedOut(){
        return this.checkedOut;
    }

    public void checkOut(){
        this.checkedOut = true;
    }

    public void checkIn(){
        this.checkedOut = false;
    }


}
