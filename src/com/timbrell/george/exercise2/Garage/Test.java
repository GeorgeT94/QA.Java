package com.timbrell.george.exercise2.Garage;

public class Test {
    public static void main(String[] args) {
        Car mercedes = new Car(1, "mercedes" , 5 ,"black", "c-class", 2000);
        Motorbike suzuki = new Motorbike(2, "suzuki", 1, "green" , "ninja", 2005, 400);
        Bus schoolBus = new Bus(3, "schoolBus", 40, "yellow", "big bus", 2010);

        Garage myGarage = new Garage();
        myGarage.store(mercedes);
        myGarage.store(suzuki);
        myGarage.store(schoolBus);

        //System.out.println(mercedes.getBill(1));
        myGarage.iterate();
        myGarage.removeVehicleByID(1);
        myGarage.removeVehicleByName("suzuki");
        myGarage.getVehicleByID(1);
    }
}
