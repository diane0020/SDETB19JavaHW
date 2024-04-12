package org.example.e154;

class Parent {
    private int number;
    Parent() {
        System.out.println("Parent Constructor without argument");
    }

    Parent(int number) {
        this.number = number;
        System.out.println(number);

    }

}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child Constructor without argument");
    }

    Child(int number) {
        super(number);
    }
}
public class E154SuperKeyword {
    public static void main(String[] args) {

        Child child1 = new Child();
        Child child2 = new Child(10);

    }
}
