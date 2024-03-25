package org.example.e84;

public class E84NestedForLoops {
    public static void main(String[] args) {

        int rows = 4;
        int columns = 4;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= columns; j++) {
                // Print '$' for the first and last rows or first and last columns
                if (i == 1|| i == rows || j == 1 || j == columns) {
                    System.out.print("$");
                } else {
                    // Print space for the inner rows and columns
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

}

