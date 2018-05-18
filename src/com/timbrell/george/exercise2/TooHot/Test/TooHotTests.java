package com.timbrell.george.exercise2.TooHot.Test;


import static org.junit.Assert.*;

import com.timbrell.george.exercise2.TooHot.TooHot;
import org.junit.Test;

public class TooHotTests {


    @Test
    public void insideRangeSummerFalse() {
        TooHot testing = new TooHot();
        assertEquals(true, testing.tempInRange(70,false));
    }

    @Test
    public void insideRangeSummerTrue() {
        TooHot testing = new TooHot();
        assertEquals(true, testing.tempInRange(95,true));
    }

    @Test
    public void otusideRangeSummerFalse() {
        TooHot testing = new TooHot();
        assertEquals(false, testing.tempInRange(0,false));
    }

    @Test
    public void outsideRangeLargeNumber() {
        TooHot testing = new TooHot();
        assertEquals(false, testing.tempInRange(2000000,false));
    }

    @Test
    public void outsideRangeLargeNegative() {
        TooHot testing = new TooHot();
        assertEquals(false, testing.tempInRange(-2000000,false));
    }

}