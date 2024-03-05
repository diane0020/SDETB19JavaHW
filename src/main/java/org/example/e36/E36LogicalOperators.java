package org.example.e36;

import java.util.Objects;
import java.util.Scanner;

public class E36LogicalOperators {
    //Note: When you are done with coding comment these two prints to successfully pass your test

    //System.out.println("Please enter two strings");
    //System.out.println("Please enter two numbers");
    public static void main(String[] args) {

        /*
        **For you to do:**
Prompt user to input two strings :
    "Please enter two strings"
* and two integers:
    "Please enter two numbers"

and make the comparisons:

- if int1 and int2 are equal **and** word1 and word2 are equal, output "AND"
- if int1 and int2 are equal **or** word1 and word2 are equal, output "OR"
- if int1 and int2 are **not** equal **and** word1 and word2 are **not** equal, output "NONE"

```
         */

        Scanner scan = new Scanner(System.in);

       // System.out.println("Please enter two strings: ");
        //System.out.print("word1: ");
        String word1 = scan.next();

        scan.nextLine();
        //System.out.print("word2: ");
        String word2 = scan.nextLine();

        //System.out.println("Please enter two integer: ");
        //System.out.print("int1: ");
        int num1 = scan.nextInt();
        //System.out.print("int2: ");
        int num2 = scan.nextInt();

        if (num1 == num2 && word1.equals(word2)) {
            System.out.println("AND");

        } else if (num1 == num2 || word1.equals(word2)) {
            System.out.println("OR");

        } else {
            System.out.println("NONE");
        }

    }
}
