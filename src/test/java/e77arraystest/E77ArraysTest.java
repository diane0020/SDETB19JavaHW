package e77arraystest;

import org.example.e77.E77Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E77ArraysTest{

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
    public void testPrintArrayInReverse() {
        int[] inputArray = {1, 2, 3, 4, 5};
        E77Arrays.main(inputArray);

        StringBuilder expectedOutputBuilder = new StringBuilder();
        for (int i = inputArray.length - 1; i >= 0; i--) {
            expectedOutputBuilder.append(inputArray[i]).append(System.lineSeparator());
        }
        String expectedOutput = expectedOutputBuilder.toString();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program prints the elements of the array in reverse order.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}
