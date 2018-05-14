package com.timbrell.george.exercise1;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Conditionals2 {
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
    public static void testAddOrMultiply(int x, int y){
        int testInt0 = x;
        int testInt1 = y;
        System.out.println(
                "The sum of " + testInt0 + " and " + testInt1 + " is " +
                        addOrMultiply( testInt0, testInt1, true)
        );
        System.out.println(
                "The multiple of " + testInt0 + " and " + testInt1 + " is " +
                        addOrMultiply(testInt0, testInt1,false)
        );
        testInt0 = 0;
        System.out.println("if one variable is zero the other is always returned");
        System.out.println(
                "The multiple of " + testInt0 + " and " + testInt1 + " now returns " +
                        addOrMultiply(testInt0, testInt1,false)
        );
        System.out.println();
    }
    public static void main(String[] args) {
        testAddOrMultiply(5, 6);
    }
}
