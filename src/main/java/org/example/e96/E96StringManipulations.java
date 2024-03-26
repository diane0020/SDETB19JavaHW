package org.example.e96;

import java.util.Scanner;

public class E96StringManipulations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any programming language");
        String str = scan.next();

        String language = str.toLowerCase();
        switch (language) {
            case "java":
                System.out.println("Java is a programming language");
                break;

            case "c":
                System.out.println("C is a procedural programming language");
                break;

            case "c++":
                System.out.println("C++ is a middle-level programming language");
                break;

            default:
                System.out.println("Doesn't match any programming language");
        }


    }
}




