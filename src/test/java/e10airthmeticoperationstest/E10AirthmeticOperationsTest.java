package e10airthmeticoperationstest;
import org.example.e10.E10AirthmeticOperations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E10AirthmeticOperationsTest {
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
    public void testArithmeticOperations1() {

        E10AirthmeticOperations.main(new String[]{});

        // Define the expected results
        int expectedAdditionResult = 300;

        String failureMessage="Declare 2 numbers and assign values 200 and 100 respectively.\n" +
                "First, add numbers, then subtract, third multiply, fourth divide.\n" +
                "Please use variables to print the values of each operation result on a separate line.\n" +
                "Output:\n" +
                "300\n" +
                "100\n" +
                "20000\n" +
                "2";

        // Verify the results using assertions
        assertEquals(failureMessage,expectedAdditionResult, outputStream.toString());

    }
    @Test
    public void testArithmeticOperations2(){
        E10AirthmeticOperations.main(new String[]{});
        int expectedSubtractionResult = 100;
        String failureMessage="Declare 2 numbers and assign values 200 and 100 respectively.\n" +
                "First, add numbers, then subtract, third multiply, fourth divide.\n" +
                "Please use variables to print the values of each operation result on a separate line.\n" +
                "Output:\n" +
                "300\n" +
                "100\n" +
                "20000\n" +
                "2";
        assertEquals(failureMessage,expectedSubtractionResult, outputStream.toString());
    }

    @Test
    public void testArithmeticOperations3(){
        E10AirthmeticOperations.main(new String[]{});
        int expectedMultiplicationResult = 20000;
        String failureMessage="Declare 2 numbers and assign values 200 and 100 respectively.\n" +
                "First, add numbers, then subtract, third multiply, fourth divide.\n" +
                "Please use variables to print the values of each operation result on a separate line.\n" +
                "Output:\n" +
                "300\n" +
                "100\n" +
                "20000\n" +
                "2";
        assertEquals(failureMessage,expectedMultiplicationResult, outputStream.toString());
    }
    @Test
    public void testArithmeticOperations4(){
        E10AirthmeticOperations.main(new String[]{});
        int expectedDivisionResult = 2;
        String failureMessage="Declare 2 numbers and assign values 200 and 100 respectively.\n" +
                "First, add numbers, then subtract, third multiply, fourth divide.\n" +
                "Please use variables to print the values of each operation result on a separate line.\n" +
                "Output:\n" +
                "300\n" +
                "100\n" +
                "20000\n" +
                "2";
        assertEquals(failureMessage,expectedDivisionResult, outputStream.toString());
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
