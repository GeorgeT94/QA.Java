package com.timbrell.george.exercise2.Library;

import java.util.ArrayList;
import java.util.Date;

public class Collection {
    private ArrayList<LibraryItem> collection = new ArrayList<LibraryItem>();

    public void checkOut(LibraryItem item) {
        if(!item.isCheckedOut()){
            item.checkOut();
        }
    }

    private void checkIn(LibraryItem item){
        if(!item.isCheckedOut()){
            item.checkOut();
        }
    }

    public void addItem(LibraryItem item){
        collection.add(item);
    }

    public void removeItem(LibraryItem item){
        collection.remove(item);
    }

    public void updateName(LibraryItem item, String name){
        int  ID =  item.getID();
        int index = getIndexByID(ID);

        if(index != -1) {
            item.setName(name);
            collection.set(index, item);
        }
    }
    public void updateDate(LibraryItem item, Date date){
        int  ID =  item.getID();
        int index = getIndexByID(ID);

        if(index != -1) {
            item.setDate(date);
            collection.set(index, item);
        }
    }

    public int getSize(){
        return collection.size();
    }

    public int getIndexByID(int id){
        for(int i =0; i < collection.size(); i++){
            if(collection.get(i).getID() == id){
                return i;
            }
        }
        return -1;
    }

    public String getReadablelist(){
        String readableStr = "";
        for(LibraryItem item: collection){
            readableStr += item.getName() + ", ";
        }

        return readableStr;
    }

}
