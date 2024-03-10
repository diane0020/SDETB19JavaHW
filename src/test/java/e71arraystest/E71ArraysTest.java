package e71arraystest;

import org.example.e71.E71Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E71ArraysTest{

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
    public void testPrintEvenIndexValues() {
        E71Arrays.main(new String[]{});
        String expectedOutput = "45 12 55 23 88 " + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program prints values at even indices of the array including index 0.\n" +
                "The expected output is '45 12 55 23 88 '.\n" +
                "Check your loop and index conditions.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}
