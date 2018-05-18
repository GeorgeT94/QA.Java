package com.timbrell.george.exercise2.TooHot;

public class Main {

    public static void main(String[] args) {
        TooHot temp = new TooHot();
        temp.testTempInRange(0, false);
        temp.testTempInRange(60, true);
        temp.testTempInRange(95, true);
        temp.testTempInRange(95, false);
        temp.testTempInRange(110, true);
    }
}
