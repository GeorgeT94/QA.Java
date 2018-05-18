package com.timbrell.george.exercise2.Garage;

public class Motorbike extends Vehicle{

    private int CC;
    public Motorbike(
            int id,
            String name,
            int seats,
            String colour,
            String model,
            int year,
            int CC
    ){
        super(id, name, seats, colour, model, year);
        this.CC = CC;
    }


    public int getEngineSize() {
        return this.CC / 10;
    }

    public int getBill(int days){
        int total = (this.getEngineSize() / 2) * days;
        return total;
    }
}
