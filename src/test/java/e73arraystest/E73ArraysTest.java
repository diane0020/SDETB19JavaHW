package e73arraystest;
import static org.junit.Assert.*;

import org.example.e73.E73Arrays;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class E73ArraysTest {

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
    public void testPrintStringArray() {
        E73Arrays.main(new String[]{});
        String expectedOutput = "This is array of strings " ;

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program prints 'This is array of strings' in one line.\n" +
                "Check your array processing logic and print statements.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}
