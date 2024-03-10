package e78arraystest;

import org.example.e78.E78Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E78ArraysTest{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testPrintMultipliedArray() {
        int[] inputArray = {1, 2, 3, 4, 5};
        E78Arrays.main(inputArray);

        StringBuilder expectedOutputBuilder = new StringBuilder();
        for (int value : inputArray) {
            expectedOutputBuilder.append(value * 10).append(System.lineSeparator());
        }
        String expectedOutput = expectedOutputBuilder.toString();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program prints each element of the array multiplied by 10.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}
