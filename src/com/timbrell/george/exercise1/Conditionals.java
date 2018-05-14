package com.timbrell.george.exercise1;

public class Conditionals {
    //returns sum of two ints if bool is true
    //returns the multiple if false
    public static int addOrMultiply(int int0, int int1, boolean bool){
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
        System.out.println(
                "The sum of " + testInt0 + "and " + testInt1 + " is " +
                addOrMultiply( testInt0, testInt1, true)
        );
        System.out.println(
                "The multiple of " + testInt0 + "and " + testInt1 + " is " +
                        addOrMultiply(testInt0, testInt1,false)
        );
    }
}
