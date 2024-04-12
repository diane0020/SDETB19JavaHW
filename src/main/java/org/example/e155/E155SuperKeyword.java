package org.example.e155;

class A {
    A() {
        System.out.println("I");
    }

}

class B extends A {
    B() {
        super();
        System.out.println("am");
    }
}

class C extends B {
    C() {
        super();
        System.out.println("a tester");
    }
}

public class E155SuperKeyword {
    public static void main(String[] args) {

        C c = new C();

    }
}

