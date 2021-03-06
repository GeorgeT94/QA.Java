package com.timbrell.george.exercise2.Garage;

public abstract class Vehicle {
    protected int id;
    protected String name;
    protected int seats;
    protected String colour;
    protected String model;
    protected int year;

    public Vehicle(
            int id,
            String name,
            int seats,
            String colour,
            String model,
            int year
    ) {
        this.id = id;
        this.name = name;
        this.seats = seats;
        this.colour = colour;
        this.model = model;
        this.year = year;
    }

    public int getId(){
        return this.id;
    }

    public String getName() {

        return this.name;
    }

    public int getSeats(){
        return this.seats;
    }

    public String getColour(){
        return this.colour;
    }

    public String getModel(){
        return this.model;
    }

    public int getYear(){
        return this.year;
    }

    public abstract int getBill(int days);

    @Override
    public String toString() {
        String returnStr = "";
        returnStr += this.name + "," +
        this.seats + ", " +
        this.colour + ", " +
        this.model+ ", " +
        this.year;
        return returnStr;
    }
}

