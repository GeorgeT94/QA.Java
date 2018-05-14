package com.timbrell.george.exercise2;

public class TooHot {

    public static boolean tempInRange(int temp, boolean isSummer) {
        int highTemp;
        int lowTemp;

        if (isSummer) {
            highTemp = 100;
            lowTemp = 60;

        } else {
            highTemp = 90;
            lowTemp = 60;
        }

        if (temp <= highTemp && temp >= lowTemp) {
            return true;
        } else {
            return false;

        }

    }

    public static void testTempInRange(int temp,boolean isSummer){
        System.out.println("temperature : " + temp + "°F ,isSumemr : " + isSummer +
                " => " + tempInRange(temp, isSummer) );
    }

    public static void main(String[] args) {
        testTempInRange(0, false);
        testTempInRange(60, true);
        testTempInRange(95, true);
        testTempInRange(95, false);
        testTempInRange(110, true);
    }
}


