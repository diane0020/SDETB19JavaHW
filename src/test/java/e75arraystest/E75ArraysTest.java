package e75arraystest;

import org.example.e75.E75Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E75ArraysTest {

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
    public void testExtractedValues() {
        E75Arrays.main(new String[]{});
        String expectedOutput = "78 55 77 " + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program prints '78 55 77 ' in one line.\n" +
                "Check your for loop's starting point and increment value to extract the correct elements from the array.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}
