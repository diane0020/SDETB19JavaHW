package org.example.e34;

import java.util.Scanner;

public class E34NestedIfAndScanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();

        if (num1 > num2){

            if (num1 > num3){

                System.out.println("The largest number is " + num1);
            } else {
                System.out.println("The largest number is " + num3);
            }

        } else if (num2 > num3) {

            if (num2 > num1){
                System.out.println("The largest number is " + num2);

            } else {
                System.out.println("The largest number is " + num3);
            }

        } else if (num3 > num1) {

            if (num3 > num2){
                System.out.println("The largest number is " + num3);

            }

        } else {
            System.out.println("Numbers should be distinct!");

        }



    }
}
