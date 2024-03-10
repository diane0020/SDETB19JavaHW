package e80arraystest;

import org.example.e80.E80Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E80ArraysTest{

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
    public void testPrintDoubledArray() {
        E80Arrays.main(new String[]{}); // Replace with your actual method call

        StringBuilder expectedOutputBuilder = new StringBuilder();
        double[][] array = {{1.4, 2.0, 3.3, 2.0}, {4.0, 1.5, 6.1, 1.0}, {1.2, 3.1, 4.0, 1.6}};
        for (double[] row : array) {
            for (double value : row) {
                expectedOutputBuilder.append(String.format("%.1f ", value * 2));
            }
            expectedOutputBuilder.append(System.lineSeparator());
        }
        String expectedOutput = expectedOutputBuilder.toString();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program correctly doubles each element of the 2D array and prints it.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString().trim());
    }
}
