package com.timbrell.george.exercise2.TooHot;

public class TooHot {

    public boolean tempInRange(int temp, boolean isSummer) {
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

    public void testTempInRange(int temp,boolean isSummer){

        System.out.println("temperature : " + temp + "°F ,isSumemr : " + isSummer +
                " => " + tempInRange(temp, isSummer) );
    }

}


