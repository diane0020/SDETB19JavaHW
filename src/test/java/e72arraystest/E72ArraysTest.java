package e72arraystest;

import org.example.e72.E72Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E72ArraysTest{

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
    public void testPrintSyntax() {
        E72Arrays.main(new String[]{});
        String expectedOutput = "syntax" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program prints 'syntax'.\n" +
                "Check your array processing logic and print statements.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}
