package e101stringmanipulationstest;

import org.example.e101.E101StringManipulations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class e101stringmanipulationstest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setIn(originalIn);
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    private void provideInput(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }

    @Test
    public void testEveryOtherLetterHello() {
        provideInput("hello\n");
        E101StringManipulations.main(new String[]{});
        String expectedOutput = "In:"+ "hlo";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testEveryOtherLetterSyntaxTechnologies() {
        provideInput("SSyynnttaaxxTTeecchhnnoollooggiieess\n");
        E101StringManipulations.main(new String[]{});
        String expectedOutput = "In:"  + "SyntaxTechnologies" ;
        assertEquals(expectedOutput, outContent.toString());
    }

    // Add more test cases as needed for additional input scenarios
}