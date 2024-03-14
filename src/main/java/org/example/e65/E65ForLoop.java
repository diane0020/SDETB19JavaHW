package org.example.e65;

import java.util.Scanner;

public class E65ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("");
        int x = input.nextInt();

        for (int i=(x-1); i>=0; i--){
            System.out.print(i + " ");
        }

    }
}
