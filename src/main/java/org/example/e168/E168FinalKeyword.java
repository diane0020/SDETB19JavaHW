package org.example.e168;

public class E168FinalKeyword {

    final String reverseString(String str) {
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        return s.toString();
    }

    public static void main(String[] args) {

        E168FinalKeyword e168 = new E168FinalKeyword();
        String reverseString = e168.reverseString("hello");

        System.out.println(reverseString);
    }
}


