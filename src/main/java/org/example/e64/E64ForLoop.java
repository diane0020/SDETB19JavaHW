package org.example.e64;

import java.util.Scanner;

public class E64ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Int:");
        int end = scan.nextInt();

        for (int i=0; i< (end*2); i++){
            System.out.print(i + " ");
        }

    }
}
