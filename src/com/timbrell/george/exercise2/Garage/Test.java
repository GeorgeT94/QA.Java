package com.timbrell.george.exercise2.Garage;

public class Test {
    public static void main(String[] args) {
        Car mercedes = new Car("mercedes" , 5 ,"black", "c-class", 2000);
        Motorbike suzuki = new Motorbike("suzuki", 1, "green" , "ninja", 2005, 400);
        Bus schoolBus = new Bus("schoolBus", 40, "yellow", "big bus", 2010);

        Garage myGarage = new Garage();
        myGarage.store(mercedes);
        myGarage.store(suzuki);
        myGarage.store(schoolBus);

        //System.out.println(mercedes.getBill(1));

        myGarage.iterate();
        myGarage.getVehicleByName("mercedes");
        myGarage.getVehicleByName("ferrrari");

    }
}
