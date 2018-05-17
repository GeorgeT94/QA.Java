package com.timbrell.george.exercise2.BlackJack;

public class Tests {
    public static void twoInts(int int0,int int1){
        System.out.println("" + int0 + ", " + int1 + " => " +BlackJack.highestNotBust(int0, int1));
    }

    public static void twoInputsTests(){
        twoInts(0,0);
        twoInts(1,15);
        twoInts(21,21);
        twoInts(22,21);
        twoInts(-1, -4);
        twoInts(-6, 14);
        twoInts(-6,22);
    }

}
