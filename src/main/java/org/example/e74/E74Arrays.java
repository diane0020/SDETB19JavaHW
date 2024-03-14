package org.example.e74;

import java.util.Scanner;

public class E74Arrays {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        int [] num = new int[5];

        for (int i=0; i< num.length; i++) {
            int input = scan.nextInt();
            num[i] = input * 10;
        }

        for (int n:num){
            System.out.println(n);
        }


    }
}
