package org.example.e153;

class Parent {
    Parent() {
        System.out.println("This is Parent constructor");
    }

}

class Child extends Parent {
    Child() {
        super();
    }
}

public class E153SuperKeyword {
    public static void main(String[] args) {

        Child child = new Child();
    }
}
