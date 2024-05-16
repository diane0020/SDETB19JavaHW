package org.example.e175;
interface MyFirstInterface {
    void firstMethod();
}
interface MySecondInterface {
    void secondMethod();
}

class MyClass implements MyFirstInterface, MySecondInterface {

    @Override
    public void firstMethod() {
        System.out.println("First Method implementing multiple Inheritance");
    }

    @Override
    public void secondMethod() {
        System.out.println("Second Method implementing multiple Inheritance");
    }
}
public class E175MultipleInterface {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.firstMethod();
        myClass.secondMethod();
    }
}

