package org.example.e152;

class Parent {
    protected String city;

    Parent(String city) {
        this.city = city;
    }

    void printInfo() {
        System.out.println(city);
    }

}

class Child extends Parent{

    Child(String city) {
        super(city);
    }
}

public class E152SuperKeyword {
    public static void main(String[] args) {

        Child child = new Child("Vienna");
        child.printInfo();

    }
}

