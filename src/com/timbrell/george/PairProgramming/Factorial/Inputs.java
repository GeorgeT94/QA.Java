package com.timbrell.george.PairProgramming.Factorial;

import java.util.Scanner;

public class Inputs {
    public static void setInputs(){
        Scanner myScanner = new Scanner(System.in);
        boolean keepTesting = true;
        long intInput;
        String strInput;

        while(keepTesting) {
            System.out.println("enter a number");


            intInput = myScanner.nextLong();
            myScanner.nextLine();

            ReverseFactorial.getFactorial(intInput);
            System.out.println("Do you want to try another number? (Y/N)");
            strInput = myScanner.nextLine();

            if (strInput.toUpperCase().equals("N")) {
                keepTesting = false;
            } else if (strInput.toUpperCase().equals("Y")) {
                continue;
            } else {
                System.out.println("invalid input");
                    setInputs();
            }
        }
    }
}
