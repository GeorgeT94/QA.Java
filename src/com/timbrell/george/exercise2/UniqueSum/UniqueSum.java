package com.timbrell.george.exercise2.UniqueSum;

public class UniqueSum {
    //Given 3 integer values, return their sum.
    // If one value is the same as another value,
    //they do not count towards the sum.
    public static int uniqueSum(int num1, int num2, int num3){
        int sum = 0;
        if(num2 != num1)
            sum += num2;
        if(num3 != num1 && num3 != num2)
            sum += num3;

        if(num3 != num1 && num1 != num2)
            sum += num1;

        return sum;
    }




}
