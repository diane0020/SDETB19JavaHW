package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        String vowel = word.replaceAll("[^a,e,i,o,u,A,E,I,O,U]", "");
        System.out.print(vowel);



    }
}