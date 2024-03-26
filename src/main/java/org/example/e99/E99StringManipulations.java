package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {

        String str = "aba";
        String reversed = "";

        for (int i = (str.length()-1); i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        if (str.equalsIgnoreCase(reversed)){
            System.out.println("In:true");
        } else {
            System.out.println("In:false");
        }
    }
}

