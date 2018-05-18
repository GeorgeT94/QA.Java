package com.timbrell.george.exercise2.Garage;

public class Bus extends Vehicle{
    public Bus(
            int id,
            String name,
            int seats,
            String colour,
            String model,
            int year
    ){
        super(id, name, seats, colour, model, year);
    }
    private int ticketPrice;


    public int getTicketPrice(){
        return this.ticketPrice;
    }


    public int getBill( int days){
        int total = 150 * days;
        return total;
    }
}
