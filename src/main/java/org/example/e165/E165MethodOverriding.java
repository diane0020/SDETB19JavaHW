package org.example.e165;

class Parent {
    public void publicDisplay() {
        System.out.println("I am parent public method");
    }

    protected void protectedDisplay() {
        System.out.println("I am parent protected method");
    }

     void defaultDisplay() {
        System.out.println("I am parent default method");
    }

    private void privateDisplay() {
        System.out.println("I am parent private method");
    }
}

class Child extends Parent {
    public void publicDisplay() {
        System.out.println("I am a child public method");
    }

    protected void protectedDisplay() {
        System.out.println("I am a child protected method");
    }

    void defaultDisplay() {
        System.out.println("I am a child default method");
    }

    private void privateDisplay() {
        System.out.println("I am a child private method");
    }

}

public class E165MethodOverriding {
    public static void main(String[] args) {

        Child c = new Child();

        c.publicDisplay();
        c.protectedDisplay();
        c.defaultDisplay();
    }
}
