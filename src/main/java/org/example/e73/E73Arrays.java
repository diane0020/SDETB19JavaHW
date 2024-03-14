package org.example.e73;

import java.util.Scanner;

public class E73Arrays {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int [] num = new int[5];

        for (int i=0; i<num.length; i++){
            int input = scan.nextInt();
            num[i] = input;
        }

        for (int i = (num.length-1); i>=0; i--){
            System.out.println(num[i]);
        }



    }
}