package org.example.e113;

public class E113JavaMethods {

    void printTime(int hour, int min) {
        System.out.println(hour + ":" + min);
    }
    public static void main(String[] args) {
        E113JavaMethods e113 = new E113JavaMethods();
        e113.printTime(11,30);
    }
}

