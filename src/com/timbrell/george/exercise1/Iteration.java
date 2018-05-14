package com.timbrell.george.exercise1;

public class Iteration {
    //returns sum of two ints if bool is true
    //returns the multiple if false
    public static int addOrMultiply(int int0, int int1, boolean bool){


        if(int0 == 0 && int1 == 0){
            System.out.println("no non zero number");
            return 0;
        }

        if(int0 == 0){
            return int1;
        }
        if(int0 == 0) {
            return int1;
        }

        if(bool){
            int sum = (int0 + int1);
            return sum;
        }else{
            int multiple = (int0 * int1);
            return multiple;
        }


    }
    public static void main(String[] args) {
        int testInt0 = 5;
        int testInt1 = 6;
        int result = -1;

        for(int i = 0; i < 10; i++){
            result = addOrMultiply(testInt0, i, false );
            System.out.println(
                    "the multiple of " + testInt0 + " and " + i +
                    " is " + result
            );

        }
    }
}

