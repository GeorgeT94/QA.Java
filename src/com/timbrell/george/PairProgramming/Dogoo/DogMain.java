package com.timbrell.george.PairProgramming.Dogoo;

import java.util.Scanner;



public class DogMain {


    public static void main(String[] args) {

        System.out.println("Please enter the place your dog");
        Scanner sc = new Scanner(System.in);
        int userPlace = sc.nextInt();
        Places.dog(userPlace);
    }
}
