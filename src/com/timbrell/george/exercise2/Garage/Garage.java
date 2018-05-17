package com.timbrell.george.exercise2.Garage;
import java.util.ArrayList;

public class Garage {

    private ArrayList<Vehicle> inventory = new ArrayList();

    public void store(Vehicle vehicle){
        inventory.add(vehicle);
    }

    public void remove(Vehicle vehicle){
        inventory.remove(vehicle);
    }

    public void empty(){
        inventory.clear();
    }

    public void iterate(){
        for(Vehicle vehicle: inventory){
            String returnStatement = "";
            returnStatement += vehicle.getName() + " fee : £" +
                    vehicle.getBill(1);

            System.out.println(returnStatement);

        }
    }

    public void getVehicleByName(String name){
        boolean isFound = false;
        for(Vehicle vehicle: inventory){
            if(vehicle.getName() == name){
                System.out.println(vehicle);
                isFound = true;
            }
        }
        if(!isFound){
            System.out.println("no vehicle with that name exists");
        }
    }

}
