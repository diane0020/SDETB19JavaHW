package org.example.e159;

public class E159MethodOverloading {

    void subtract(int a, int b) {
        System.out.println((a-b) + " (should come from subtracting 2 numbers)");
    }

    void subtract(int a, int b, int c) {
        System.out.println((a-b-c) + " (should come from subtracting 3 numbers)");
    }

    void subtract(int a, int b, int c, int d) {
        System.out.println((a-b-c-d) + " (should come from subtracting 4 numbers)");
    }


    public static void main(String[] args) {
        E159MethodOverloading e1 = new E159MethodOverloading();

        e1.subtract(100,30,20,10);
        e1.subtract(90,30,30);
        e1.subtract(30,10);

    }
}



