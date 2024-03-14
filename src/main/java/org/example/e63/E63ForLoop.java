package org.example.e63;

import java.util.Scanner;

public class E63ForLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("In:");

        int x = scan.nextInt();
        for (int i=0; i<x; i++) {
            System.out.print(i + " ");
        }

    }
}
