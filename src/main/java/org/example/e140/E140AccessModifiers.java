package org.example.e140;


public class E140AccessModifiers {

    String maxLength (String [] str) {
        String maxString = str[0];
        for (String string : str) {
            if (maxString.length() < string.length()) {
                maxString = string;
            }
        }
        return maxString;
    }
    public static void main(String[] args) {
        E140AccessModifiers e140 = new E140AccessModifiers();
        System.out.println(e140.maxLength(new String[] {"I am","this is long", "diane", "hello w"}));

    }
}
