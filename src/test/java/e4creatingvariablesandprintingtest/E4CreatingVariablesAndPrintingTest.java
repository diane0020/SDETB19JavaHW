package e4creatingvariablesandprintingtest;

import org.example.e4.E4CreatingVariablesAndPrinting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E4CreatingVariablesAndPrintingTest {
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
    public void testPrintPattern() {
        E4CreatingVariablesAndPrinting.main(new String[]{});

        System.setOut(new PrintStream(outputStream));

        // Call the method or code that prints the pattern
        //printPattern();

        System.setOut(originalOut);
        String printedPattern = outputStream.toString().trim();

        // Define the expected output
        String expectedOutput = "*\n**\n***\n##\n#";

        //String expectedOutput = printPattern();

        // Compare the actual output with the expected output
        assertEquals(expectedOutput, printedPattern);
    }

    private String printPattern() {
        String v1 ="*";
        String v2 ="**";
        String v3 ="***";
        String v4 ="##";
        String v5 ="#";


        return v1+"\n"+v2+"\n"+v3+"\n"+v4+"\n"+v5;



    }

}
