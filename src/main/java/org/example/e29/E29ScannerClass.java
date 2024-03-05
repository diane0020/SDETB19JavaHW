package org.example.e29;


import java.util.Scanner;

public class E29ScannerClass {
    public static void main(String[] args) {
        /*
        Write a java program that prints out true if ( x y ) returns a positive value.
        Else prints out false if (x y) returns a negative value.
        Step 1: Your program should ask "Please enter first number" - for the 1st number and
                "Please enter second number" - for the 2nd number.
        Step 2: Create if condition to check if the multiplication of x and y values is positive or negative.
        If the result of a multiplication is positive print true, otherwise print false.
         */

        Scanner value = new Scanner(System.in);

        System.out.println("Please enter first number");
        int num1 = value.nextInt();

        System.out.println("Please enter second number");
        int num2 = value.nextInt();

        // multiply the 2 number
        int result = num1*num2;

        if (result > 0){
            System.out.println("true");

        }  else {
            System.out.println("false");
        }
    }
}
