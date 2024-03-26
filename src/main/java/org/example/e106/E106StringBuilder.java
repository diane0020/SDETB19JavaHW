package org.example.e106;

public class E106StringBuilder {
    public static void main(String[] args) {

        String str = "Hello";

        StringBuilder str1 = new StringBuilder(str);
        str1.append(" World");
        String string = str1.toString();

        System.out.println(string.toUpperCase());



    }
}

