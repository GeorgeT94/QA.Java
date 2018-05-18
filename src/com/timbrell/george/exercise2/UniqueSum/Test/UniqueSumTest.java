package com.timbrell.george.exercise2.UniqueSum.Test;


import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.fail;

import com.timbrell.george.exercise2.BlackJack.BlackJack;
import com.timbrell.george.exercise2.UniqueSum.UniqueSum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UniqueSumTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{0, 0, 0, 0}, {1, 1, 1, 0}, {20, 22, 20, 22}, {-1, 5, 5, -1},
                {22, 50, 0, 72}, {15, 21, 21, 15}, {8, 8, 6, 6}});
    }

    private int intPut;
    private int intPut2;
    private int intPut3;
    private int intPected;

// @Parameter // first data value (0) is default
// public /* NOT private */ int fInput;
//
// @Parameter(1)
// public /* NOT private */ int fExpected;

    public UniqueSumTest(int input, int input2,int input3, int expected) {
        intPut = input;
        intPut2 = input2;
        intPut3 = input3;
        intPected = expected;
    }

    @Test
    public void test() {
        assertEquals(intPected, UniqueSum.uniqueSum(intPut, intPut2, intPut3));
    }
}
