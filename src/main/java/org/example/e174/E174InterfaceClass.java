package org.example.e174;

interface MyInterface {
    void m1();
    void m2();
}

class MyClass implements MyInterface {

    @Override
    public void m1() {
        System.out.println("implementation of method1");
    }

    @Override
    public void m2() {
        System.out.println("implementation of method2");
    }
}
public class E174InterfaceClass{

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        myClass.m1();
        myClass.m2();
    }

}