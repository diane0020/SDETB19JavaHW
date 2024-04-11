package org.example.e116;

public class E116JavaMethods {

    boolean evenNumber(int a, int b) {
        if (a<0 && b<0) {
            if ((a%2==0) && (b%2==0)) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

        E116JavaMethods e116JavaMethods = new E116JavaMethods();
        boolean result = e116JavaMethods.evenNumber(2,1);
        System.out.println(result);
    }
}


