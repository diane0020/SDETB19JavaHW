package e2ageprintertest;

import org.example.e2.E2AgePrinter;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class E2AgePrinterTest {

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
    public void testAgeOutput() {
        E2AgePrinter.main(new String[]{});
        String expectedOutput = "4"+System.lineSeparator() ;

        // Adding a detailed failure message
        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program includes a debug print statement showing the variable name,\n" +
                "and then prints the value of the 'age' variable.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}
