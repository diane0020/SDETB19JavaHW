package e76arraystest;

import org.example.e76.E76Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E76ArraysTest{

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
    public void testPrintWeekDays() {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        E76Arrays.main(days);

        StringBuilder expectedOutputBuilder = new StringBuilder();
        for (int i = 0; i < days.length; i++) {
            expectedOutputBuilder.append("Please enter day ").append(i + 1).append(" of the week")
                    .append(System.lineSeparator())
                    .append(days[i])
                    .append(System.lineSeparator());
        }
        for (String day : days) {
            expectedOutputBuilder.append(day).append(System.lineSeparator());
        }

        String expectedOutput = expectedOutputBuilder.toString();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program prints the prompts and then the days of the week in order.\n";

        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}
