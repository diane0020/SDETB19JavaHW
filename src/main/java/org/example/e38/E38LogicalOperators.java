package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    //Note: When you are done with coding comment these two prints to successfully pass your test
    // System.out.println("Is it weekend?");
    public static void main(String[] args) {

        /*
        Prompt user with a question:
        "Is it weekend?"
        If it is not a weekend -- > subject = "manual testing"
        Otherwise-- > subject = "Java"
         */


        Scanner scanner = new Scanner(System.in);
        //System.out.println("Is it the weekend?");
        boolean isWeekend = scanner.nextBoolean();

        if (isWeekend) {
            System.out.println("Today you will be learning Java");

        } else {
            System.out.println("Today you will be learning manual testing");

        }


    }
}
