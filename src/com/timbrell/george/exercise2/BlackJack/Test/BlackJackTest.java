package com.timbrell.george.exercise2.BlackJack.Test;


        import static org.junit.Assert.*;
        import static org.junit.jupiter.api.Assertions.fail;

        import com.timbrell.george.exercise2.BlackJack.BlackJack;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.junit.runners.Parameterized;

        import java.io.BufferedReader;
        import java.util.Arrays;
        import java.util.Collection;

@RunWith(Parameterized.class)
public class BlackJackTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{0, 0, 0}, {1, 1, 1}, {20, 22, 20}, {-1, 5, 5},
                {22, 50, 0}, {15, 21, 21}, {6, 8, 8}});
    }

    private int intPut;
    private int intPut2;
    private int intPected;

// @Parameter // first data value (0) is default
// public /* NOT private */ int fInput;
//
// @Parameter(1)
// public /* NOT private */ int fExpected;

    public BlackJackTest(int input, int input2, int expected) {
        intPut = input;
        intPut2 = input2;
        intPected = expected;

    }

    @Test
    public void test() {
        assertEquals(intPected, BlackJack.play(intPut, intPut2));
    }
}
