package org.example.e172;

abstract class Parent {
    abstract void m1();

    void m2() {
        System.out.println("Parent class providing implementation");
    }
}
public class E172AbstractClass extends Parent  {
    public static void main(String[] args){
        E172AbstractClass abstractClass = new E172AbstractClass();
        abstractClass.m1();
        abstractClass.m2();

    }


    @Override
    void m1() {
        System.out.println("Child class providing implementation");
    }
}





