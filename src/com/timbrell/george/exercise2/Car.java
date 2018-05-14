package com.timbrell.george.exercise2;

public class Car extends Vehicle {
    public Car(
            String name,
            int seats,
            String colour,
            String model,
            int year
    ){
        super( name, seats, colour, model, year);
    }

    public static void main(String[] args) {
        Car mercedes = new Car("mercedes" , 5 ,"black", "c-class", 2000);
    }
}
