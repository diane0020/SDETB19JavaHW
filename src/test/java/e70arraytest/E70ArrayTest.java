package e70arraytest;

import org.example.e70.E70Array;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E70ArrayTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    @Test
    public void testArrayPrinting() {
        E70Array.main(new String[]{});

        // Get the printed output
        String printedOutput = outputStream.toString().trim();

        // Define the expected output
        String expectedOutput = "45 78 12 67 55 ";

        String failureMessage ="Write a program that creates an array of integers and stores the following values: 45, 78, 12, 67, 55 and then prints all array values.\n" +
                "**Output:**\n" +
                "45 78 12 67 55";

        // Compare the concatenated string with the expected output
        assertEquals(failureMessage,expectedOutput, outputStream.toString());
    }
}
