package e3creatingvariableandprintingtest;

import org.example.e3.E3CreatingVariableAndPrinting;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E3CreatingVariableAndPrintingTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Test
    public void testPrintValues() {
        // Create a variable called "myBoolean" and set it to false
        boolean myBoolean = false;

        // Create a variable called "money" and set it to 99999.99
        double money = 99999.99;

        // Print value of variable "money" and "myBoolean" on the same line
        System.out.print(money);
        System.out.print(myBoolean);

        // Define the expected output
        String expectedOutput = "99999.99false";

        // Compare the actual output with the expected output
        assertEquals(expectedOutput, getConsoleOutput());
    }

    // Helper method to capture console output
    private String getConsoleOutput() {

        System.setOut(new PrintStream(outputStream));
        E3CreatingVariableAndPrinting.main(new String[]{});
        System.setOut(originalOut);
        return outputStream.toString().trim();
    }

}
