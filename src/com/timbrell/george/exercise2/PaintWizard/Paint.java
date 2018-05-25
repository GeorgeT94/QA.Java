package com.timbrell.george.exercise2.PaintWizard;

public class Paint {
    private int volume; //litres
    private double price; //pounds
    private int areaPerLitre; //m^2 / litre
    private String name;

    Paint(String name, int volume, double price, int areaPerLitre){
        this.name  =name;
        this.volume = volume;
        this.price = price;
        this.areaPerLitre = areaPerLitre;
    }

    public String getName() {
        return this.name;
    }

    public int getVolume() {
        return volume;
    }

    public double getPrice(){
        return this.price;
    }

    public int getAreaPerLitre() {
        return this.areaPerLitre;
    }

    private int coveragePerCan(){
        return (this.volume * this.areaPerLitre); //m^2
    }

    private int cansForArea(int roomArea){
        double area = (double)roomArea;

        int cansNeeded = (int)Math.ceil(area / this.coveragePerCan());
        return cansNeeded;
    }
    public double costForArea(int roomArea){

        double total = cansForArea(roomArea) * this.price;
        return total;

    }

    public double wasteForArea(int roomArea){
        double maxCoverage = cansForArea(roomArea) * this.coveragePerCan();
        double wastage = (maxCoverage - roomArea)/getAreaPerLitre();
        //System.out.println("wastage: " + wastage + ", ");
        return wastage;
    }

    @Override
    public String toString() {
        String output = "";
        output += "volume: " + this.volume + " price: " +
        this.price + "area/litre: " +
        this.areaPerLitre;
        return output;
    }
}
