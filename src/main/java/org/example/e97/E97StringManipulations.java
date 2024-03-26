package org.example.e97;

import java.util.Scanner;

public class E97StringManipulations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name to proceed further with execution");
        String str = scanner.next().toLowerCase();

        switch (str){
            case "chrome":
                System.out.println("Proceed with Chrome browser");
                break;

            case "firefox":
                System.out.println("Proceed with Firefox browser");
                break;

            case "ie":
                System.out.println("Proceed with IE browser");
                break;

            default:
                System.out.println("Invalid browser");
        }

    }
}
