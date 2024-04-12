package org.example.e163;

class Parent {
    void method() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void method() {
        System.out.println("Child method");
    }
}

public class E163MethodOverriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        p.method();
        c.method();

    }
}
