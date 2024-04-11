package org.example.e114;

public class E114JavaMethods {

    void multiplication (int a, int b) {
        System.out.println("Multiplication " + (a*b));
    }

    void addition (int a, int b) {
        System.out.println("Addition " + (a+b) );
    }

    void subtraction (int a, int b){
        System.out.println("Subtraction " + (a-b));
    }
    public static void main(String[] args) {

        E114JavaMethods e114JavaMethods = new E114JavaMethods();
        e114JavaMethods.addition(20,10);
        e114JavaMethods.multiplication(5,6);
        e114JavaMethods.subtraction(40,20);
    }
}
