package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {

        ReverseString string = new ReverseString();

        String str = "aba";
        String reversed = string.reverse(str);

        if (str.equalsIgnoreCase(reversed)){
            System.out.println("In:true");
        } else {
            System.out.println("In:false");
        }
    }
}

