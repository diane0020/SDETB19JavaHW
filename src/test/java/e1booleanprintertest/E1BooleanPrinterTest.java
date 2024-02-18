package e1booleanprintertest;

import org.example.e1.E1BooleanPrinter;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class E1BooleanPrinterTest {

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
    public void testBooleanOutput() {
        E1BooleanPrinter.main(new String[]{});
        String expectedOutput = "true" + System.lineSeparator() + "false" + System.lineSeparator();

        // Adding a detailed failure message
        String failureMessage = "The output does not match the expected values.\n " +
                "Please ensure that your program prints exactly two lines: \n" +
                "'true' followed by 'false'. Check your print statements and \n" +
                "ensure that the boolean variables are correctly assigned.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}
