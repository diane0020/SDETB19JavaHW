package org.example.e149;

 class A {
    void printA() {
        System.out.println("Class A");
    }
}

class B extends A {
    void printB() {
        System.out.println("Class B");
    }
}

public class E149Inheritance {
    public static void main(String[] args) {

        B b = new B();
        b.printA();
        b.printB();
    }
}
