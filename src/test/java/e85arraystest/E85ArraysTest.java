package e85arraystest;

import org.example.e85.E85Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E85ArraysTest {

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
    public void testSumEvenIndexEvenRow() {
        int[][] inputArray = {{-1, 2, -3}, {4, -5, 6}, {-7, 8, -9}}; // Example array
        E85Arrays.main(inputArray); // Replace with your actual method call

        String expectedOutput = "-4" + System.lineSeparator();
        String failureMessage = "The output does not match the expected sum of numbers on even index and even row.\n" +
                "Please ensure that your program correctly calculates and prints the sum.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}
