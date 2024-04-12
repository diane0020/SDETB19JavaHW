package org.example.e166;

class Animal {
    protected String kind;
    protected String name;

    Animal(String kind, String name) {
        this.kind = kind;
        this.name = name;
    }

    void eat() {
        System.out.println("Cat eats");
    }

    void sleep() {
        System.out.println("Animal sleeps");
    }
}

class Cat extends Animal {

    Cat(String kind, String name) {
        super(kind, name);
    }

    @Override
    void sleep() {
        System.out.println(name + " sleeps a lot");
    }
}

class Kitten1 extends Cat {
    Kitten1(String kind, String name) {
        super(kind, name);
    }

    @Override
    void eat() {
        System.out.println(name + " eats milk");
    }
}

class Kitten2 extends Cat {

    Kitten2(String kind, String name) {
        super(kind, name);
    }

    @Override
    void eat() {
        System.out.println(name + " eats snacks");
    }
}

class Kitten3 extends Cat {
    Kitten3(String kind, String name) {
        super(kind, name);
    }

    @Override
    void eat() {
        System.out.println(name + " eats everything");
    }
}

public class E166MethodOverriding {
    public static void main(String[] args) {
        Animal [] animals = {new Cat("Cat", "Cat"), new Kitten1("Cat", "kitten1"),
        new Kitten2("Cat", "kitten2"), new Kitten3("Cat", "kitten3")};

        for (Animal cat : animals) {
            cat.eat();
            cat.sleep();
        }
    }
}
