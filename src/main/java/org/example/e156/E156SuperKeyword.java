package org.example.e156;

class A {
    private int i;
    A () {
        i = 10;
    }

    void printA() {
        System.out.println(i);
    }
}

class B extends A {

    private int i;
    B() {
        i = 20;
    }

    void printI() {
        System.out.println(i);
        super.printA();

    }
}
public class E156SuperKeyword {
    public static void main(String[] args) {

        B b = new B();
        b.printI();

}
}
