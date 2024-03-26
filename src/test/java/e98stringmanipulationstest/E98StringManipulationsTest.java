package e98stringmanipulationstest;

import org.example.e98.E98StringManipulations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E98StringManipulationsTest {

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
    public void testManipulateString() {
        String given = "Hello Syntax friends";
        String manipulatedString = given.replace("friends", "family");
        E98StringManipulations.main(new String[]{manipulatedString});
        String expectedOutput = "Welcome Syntax family" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
