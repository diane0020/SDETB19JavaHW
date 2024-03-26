package org.example.e94;

public class E94StringManipulations {
    public static void main(String[] args) {
        String given = "I love Java classes at Syntax";

        String str1 = given.substring(12,given.length());
        System.out.println(str1);
        String str2 = given.substring(0,12);
        System.out.println(str2.trim());

    }
}
