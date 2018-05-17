package com.timbrell.george.exercise2.PaintWizard;

import java.util.ArrayList;

public class PaintMain {
    public static void main(String[] args) {
        Paint cheapoMax = new Paint("CheapoMax",20,19.99,10);
        Paint averageJoes = new Paint("AverageJoes", 15,17.99,11);
        Paint duluxourousPaints = new Paint("DuluxourousPaints",10,25,20);


        PaintStore store = new PaintStore();

        store.addpaint(cheapoMax);
        store.addpaint(averageJoes);
        store.addpaint(duluxourousPaints);

        PaintCalc.cheapest(store.getPaintArray(), 2000);
        PaintCalc.leastWastage(store.getPaintArray(), 1000);

    }
}
