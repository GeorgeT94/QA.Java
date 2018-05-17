package com.timbrell.george.exercise2.PaintWizard;
import java.util.ArrayList;

public class PaintStore {
    private ArrayList<Paint> paintArray = new ArrayList<Paint>();

    public void addpaint(Paint paint){
        paintArray.add(paint);
    }

    public void removePaint(Paint paint){
        paintArray.remove(paint);
    }

    public void clearStore(){
        paintArray.clear();
    }

    public ArrayList<Paint> getPaintArray() {
        return this.paintArray;
    }
}
