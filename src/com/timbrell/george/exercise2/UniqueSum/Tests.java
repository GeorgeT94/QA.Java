package com.timbrell.george.exercise2.UniqueSum;

public class Tests {
    public static void threeInts(int int1, int int2, int int3){
        System.out.println(""+ int1 + ", " + int2 + ", " + int3+ " => " + UniqueSum.uniqueSum(int1,int2,int3));
    }
    public static void testUniqueSum(){
        threeInts(1,2,3);
        threeInts(2,2,1);
        threeInts(5,5,5);
        threeInts(1,2,-1);
        threeInts(0,-2,-5);
    }
}
