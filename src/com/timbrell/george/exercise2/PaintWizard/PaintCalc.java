package com.timbrell.george.exercise2.PaintWizard;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class PaintCalc {

    //
    public static Paint leastWastage(ArrayList<Paint> paintList,int area){
        Paint leastWaste = null;
        double minWastage = 1000000;
        for(Paint paint: paintList){
            if(paint.wasteForArea(area) < minWastage){
                minWastage = paint.wasteForArea(area);
                leastWaste = paint;
            }
        }
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("The paint that gives the least wastage for " + area + "m² is: " + leastWaste.getName() + "with " + df.format(minWastage) + "Litres left over");
        return leastWaste;
    }

    public static Paint cheapest(ArrayList<Paint> paintList,int area){
        Paint cheapestPaint = null;
        double maxCost = Integer.MAX_VALUE;
        for(Paint paint: paintList){
            if(paint.costForArea(area) < maxCost){
                maxCost = paint.costForArea(area);
                cheapestPaint = paint;
            }
        }
        System.out.println("The cheapest paint for " + area + "m² is: " + cheapestPaint.getName());
        return cheapestPaint;

    }
}
