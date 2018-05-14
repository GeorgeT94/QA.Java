package com.timbrell.george.exercise1;


public class Arrays {



    //populate array



    public static void main(String[] args) {
        int arraySize = 10;
        int[] myIntArray = new int[arraySize];
        ArrayIteration.populate(myIntArray, arraySize);

        System.out.println("The array is:");
        ArrayIteration.iterate(myIntArray);


        for(int i = 0; i < 10; i++){
            int randInt1 = (int)(Math.random()*myIntArray.length);
            int randInt2 = (int)(Math.random()*myIntArray.length);

            //test

            Conditionals2.testAddOrMultiply(myIntArray[randInt1], myIntArray[randInt2]);


        }

        System.out.println("the array times by ten is: ");
        ArrayIteration.tenXArray(myIntArray);
        ArrayIteration.iterate(myIntArray);
    }

}