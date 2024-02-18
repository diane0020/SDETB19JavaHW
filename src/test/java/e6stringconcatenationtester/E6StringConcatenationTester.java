package e6stringconcatenationtester;
import org.example.e6.E6StringConcatenation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E6StringConcatenationTester {
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
    public void testFullNameConcatenation() {
        // Create a NameConcatenation object
        //NameConcatenation nameConcatenation = new NameConcatenation();
        E6StringConcatenation.main(new String[]{});

        // Call the concatenateNames method with "John" and "Smith"
        //String result = nameConcatenation.concatenateNames("John", "Smith");
        String failureMessage="Create a variable and assign the value of \"John\" to it.\n" +
                "Create a variable and assign the value of \"Smith\" to it.\n" +
                "**Output:**\n" +
                "```\n" +
                "John Smith";
        // Define the expected result
        String expected = "John Smith";

        // Assert that the result matches the expected value
        assertEquals(failureMessage,expected, outContent.toString());
    }
}
