package org.example.e158;

class Parent {
    protected String city;

    Parent(String city) {
        this.city = city;
    }

    public void display() {
        System.out.println("City name " + city);
    }
}

class Child extends Parent {

    Child(String city) {
        super(city);
    }
}

public class E158SuperKeyword {
    public static void main(String[] args) {

        Child c = new Child("Fairfax");
        c.display();

    }
}

