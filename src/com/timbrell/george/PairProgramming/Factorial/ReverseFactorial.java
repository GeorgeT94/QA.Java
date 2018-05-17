package com.timbrell.george.PairProgramming.Factorial;

public class ReverseFactorial {

    public static long getFactorial(long number){
        long divisionResult = number;
        boolean factorialFound  = false;
        long result = -1;

        int  i = 1;
        while(!factorialFound) {
            divisionResult = divisionResult/ i;
            if (divisionResult == 1) {
                System.out.println("" + number + "=" + i + "!" );
                result = i;
                factorialFound = true;

            }if(divisionResult != (int)divisionResult){
                result = -1;
                System.out.println(number + " None".toUpperCase());
                break;

            }

            i++;
        }
     return result;
    }
}
