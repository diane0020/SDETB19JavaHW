package org.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();

        String reversed = "";

        for (int i = (in.length()-1); i >= 0; i--) {
            reversed = reversed + in.charAt(i);
        }

        System.out.println("In:" + reversed);



    }
}
