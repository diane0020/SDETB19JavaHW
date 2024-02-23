package e10airthmeticoperationstest;
import org.example.e10.E10AirthmeticOperations;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class E10AirthmeticOperationsTest {
    private static final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private static  final PrintStream originalOut = System.out;

    @BeforeClass
    public static void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterClass
    public static void restoreStreams() {
        System.setOut(originalOut);
    }
    @Test
    public void testArithmeticOperations1() {

        E10AirthmeticOperations.main(new String[]{});

        // Define the expected results
        int expectedAdditionResult = 300;
        List<String> outputLines = Arrays.asList(outputStream.toString().trim().split("\n"));

        String failureMessage="Declare 2 numbers and assign values 200 and 100 respectively.\n" +
                "First, add numbers, then subtract, third multiply, fourth divide.\n" +
                "Please use variables to print the values of each operation result on a separate line.\n" +
                "Output:\n" +
                "300\n" +
                "100\n" +
                "20000\n" +
                "2";

        // Verify the results using assertions
        assertEquals(failureMessage,String.valueOf(expectedAdditionResult), outputLines.get(0).trim());

    }
    @Test
    public void testArithmeticOperations2(){
        E10AirthmeticOperations.main(new String[]{});
        List<String> outputLines = Arrays.asList(outputStream.toString().trim().split("\n"));
        int expectedSubtractionResult = 100;
        String failureMessage="Declare 2 numbers and assign values 200 and 100 respectively.\n" +
                "First, add numbers, then subtract, third multiply, fourth divide.\n" +
                "Please use variables to print the values of each operation result on a separate line.\n" +
                "Output:\n" +
                "300\n" +
                "100\n" +
                "20000\n" +
                "2";
        assertEquals(failureMessage,String.valueOf(expectedSubtractionResult), outputLines.get(1).trim());
    }

    @Test
    public void testArithmeticOperations3(){
        E10AirthmeticOperations.main(new String[]{});
        List<String> outputLines = Arrays.asList(outputStream.toString().trim().split("\n"));
        int expectedMultiplicationResult = 20000;
        String failureMessage="Declare 2 numbers and assign values 200 and 100 respectively.\n" +
                "First, add numbers, then subtract, third multiply, fourth divide.\n" +
                "Please use variables to print the values of each operation result on a separate line.\n" +
                "Output:\n" +
                "300\n" +
                "100\n" +
                "20000\n" +
                "2";
        assertEquals(failureMessage,String.valueOf(expectedMultiplicationResult), outputLines.get(2).trim());
    }
    @Test
    public void testArithmeticOperations4(){
        E10AirthmeticOperations.main(new String[]{});
        List<String> outputLines = Arrays.asList(outputStream.toString().trim().split("\n"));
        int expectedDivisionResult = 2;
        String failureMessage="Declare 2 numbers and assign values 200 and 100 respectively.\n" +
                "First, add numbers, then subtract, third multiply, fourth divide.\n" +
                "Please use variables to print the values of each operation result on a separate line.\n" +
                "Output:\n" +
                "300\n" +
                "100\n" +
                "20000\n" +
                "2";
        assertEquals(failureMessage,String.valueOf(expectedDivisionResult), outputLines.get(3).trim());
    }

    // Method to add two numbers
    private int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    private int subtractNumbers(int num1, int num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    private int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }

    // Method to divide two numbers
    private int divideNumbers(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }
}
