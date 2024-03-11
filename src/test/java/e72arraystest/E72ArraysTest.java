package e72arraystest;
import static org.junit.Assert.*;

import org.example.e72.E72Arrays;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
        String expectedOutput = "syntax";

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program prints 'syntax'.\n" +
                "Check your array processing logic and print statements.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}
