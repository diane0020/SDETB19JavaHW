package org.example.e100;

import org.example.e99.ReverseString;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();

        ReverseString string = new ReverseString();
        String reversed = string.reverse(in);
        System.out.println("In:" + reversed);



    }
}
