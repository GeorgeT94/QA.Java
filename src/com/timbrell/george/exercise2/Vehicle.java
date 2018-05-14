package com.timbrell.george.exercise2;

public class Vehicle {
    protected String name;
    protected int seats;
    protected String colour;
    protected String model;
    protected int year;


    //public Vehicle() {

    //}

    public Vehicle(
            String name,
            int seats,
            String colour,
            String model,
            int year
    ) {
        this.name = name;
        this.seats = seats;
        this.colour = colour;
        this.model = model;
        this.year = year;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}

