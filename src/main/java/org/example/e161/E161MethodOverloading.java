package org.example.e161;

public class E161MethodOverloading {

    private void m1() {
        System.out.println("private m1 method ");
    }

    private void m1(int a) {
        System.out.println("private m1 method with int parameter");
    }
    public static void main(String[] args) {

        E161MethodOverloading e1 = new E161MethodOverloading();

        e1.m1();
        e1.m1(1);

    }
}


