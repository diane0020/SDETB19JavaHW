package org.example.e171;

abstract class Parent {
    abstract void m1();
    abstract void m1 (String myString);
}

class Child extends Parent {


    @Override
    void m1() {
        System.out.println("m1 without parameters");
    }

    @Override
    void m1(String myString) {
        System.out.println("m1 method with parameter");

    }
}

public class E171AbstractClass {
    public static void main(String[] args){
        Child child = new Child();
        child.m1();
        child.m1("diane");

    }
}


