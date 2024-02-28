package e20Test;

import org.example.e20.E20ScannerClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class E20ScannerClassTest {
    private InputStream originalSystemIn;
    private ByteArrayOutputStream outputStream;


    public void setUpInputOutput() {
        originalSystemIn = System.in;
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }


    public void restoreSystemInAndOut() {
        System.setIn(originalSystemIn);
        System.setOut(System.out);
    }

    @Test
    public void testUserNameInput() {
        setUpInputOutput();
        setSystemIn("John\nDoe\n"); // Simulate user input of 'John' and 'Doe'
        E20ScannerClass.main(new String[0]);
        assertEquals("Please Enter First Name\nPlease Enter Last Name\nJohn Doe", getOutput().replace("\r\n", "\n"));
        restoreSystemInAndOut();
    }

    private void setSystemIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    private String getOutput() {
        return outputStream.toString();
    }






}

