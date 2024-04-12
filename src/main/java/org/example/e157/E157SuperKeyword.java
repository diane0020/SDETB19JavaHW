package org.example.e157;

class Parent {
     void m1() {
         System.out.println("m1 method in parent class");
     }
}

class Child extends Parent {
    void m2() {
        System.out.println("m1 method in child class");
        super.m1();
    }
}

public class E157SuperKeyword {
    public static void main(String[] args) {

        Child c = new Child();
        c.m2();

    }
}


