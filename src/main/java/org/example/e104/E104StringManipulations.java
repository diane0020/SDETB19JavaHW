package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        //write code from here
        String str = "";


        for (int i = 0; i < arr.length; i++) {
            str = input.next();
            if (str.length() >= 3 ){
                arr[i] = str;
            } else {
                System.out.println("Must be at least 3 character long");
                i--;
            }
        }

        for (String a : arr) {
            System.out.println(a.substring(0, 3));

        }


    }
}


