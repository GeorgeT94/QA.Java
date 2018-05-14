package com.timbrell.george.exercise1;

public class ArrayIteration {

    public static void iterate(int[] inputArray) {
        for (int ele : inputArray) {
            System.out.print(ele + ", ");
        }
    }

    public static void populate(int[] array, int arraySize) {
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public static void tenXArray(int[] array){

        for (int i = 0; i  < array.length; i++){
            array[i] *= 10;
        }
    }
}

