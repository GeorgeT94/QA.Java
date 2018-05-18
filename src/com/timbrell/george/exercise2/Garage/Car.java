package com.timbrell.george.exercise2.Garage;

public class Car extends Vehicle {
    public Car(
            int id,
            String name,
            int seats,
            String colour,
            String model,
            int year
    ){
        super( id, name, seats, colour, model, year);
    }


    public int getBill(int days){

        int total = 10 * this.getSeats() * days;
        return total;

    }


    public static void main(String[] args) {
        Car mercedes = new Car(1,"mercedes" , 5 ,"black", "c-class", 2000);
    }
}
