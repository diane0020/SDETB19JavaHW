package org.example.e44;

import java.util.Locale;
import java.util.Scanner;

public class E44SwitchStatment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String carOrigin = scanner.next().toLowerCase(Locale.ROOT);

        switch (carOrigin) {
            case "bmw":
                System.out.println("Your favorite car is german car");
                break;

            case "toyota":
                System.out.println("Your favorite car is japanese car ");
                break;

            case "maserati":
                System.out.println("Your favorite car is italian car");
                break;

            default:
                System.out.println("Your favorite car is unknown");

        }

    }
}
