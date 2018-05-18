package com.timbrell.george.exercise2.Garage;
import java.util.ArrayList;

public class Garage {

    private ArrayList<Vehicle> inventory = new ArrayList();

    public void store(Vehicle vehicle)
    {
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

    public void removeVehicleByName(String name){
        boolean isFound = false;
        for(int i=0; i < inventory.size(); i++){

            if(inventory.get(i).getName() == name){
                inventory.remove(i);
                System.out.println(inventory.get(i).getName() + " removed!");
                isFound = true;

            }
        }
        if(!isFound){
            System.out.println("no vehicle with that name exists");
        }
    }

    public void removeVehicleByID(int ID){
        boolean isFound = false;
        for(int i=0; i < inventory.size(); i++){

            if(inventory.get(i).getId() == ID){
                inventory.remove(i);
                isFound = true;
                System.out.println(inventory.get(i).getName() + " removed!");

            }
        }
        if(!isFound){
            System.out.println("no vehicle with that ID exists");
        }
    }

    public void getVehicleByID(int ID){
        boolean isFound = false;
        for(int i=0; i < inventory.size(); i++){

            if(inventory.get(i).getId() == ID){
                isFound = true;
                System.out.println(inventory.get(i).getName() + " found");

            }
        }
        if(!isFound){
            System.out.println("no vehicle with that ID exists");
        }
    }
}
