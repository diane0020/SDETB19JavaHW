package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    //Note: When you are done with coding comment these two prints to successfully pass your test

    //System.out.println("Do you need a loan? (true/false)");
    // System.out.println("What is your credit score?");
//    Based on the score define users eligibility:
//
//            - if score is below  600 --> eligibility = "Not eligible"
//            - if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
//            - if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
//            - if score is higher than any other previous values --> eligibility = "Definitely eligible" .

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //System.out.println("Do you need a loan? (true/false)");
        boolean needLoan = scanner.nextBoolean();

        if (needLoan) {
            //System.out.println("What is your credit score?");
            int score = scanner.nextInt();

            if (score > 800){
                System.out.println("The eligibility is Definitely eligible");

            } else if (score > 700 && score <= 800) {
                System.out.println("The eligibility is Eligible");

            } else if (score >= 600 && score <= 700) {
                System.out.println("The eligibility is Maybe eligible");

            } else {
                System.out.println("The eligibility is Not eligible");
            }

        } else {
            System.out.println("The eligibility is Unknown");

        }

    }
}
