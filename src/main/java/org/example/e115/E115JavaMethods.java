package org.example.e115;

public class E115JavaMethods {

    String upperCase(String str) {
        return str.toUpperCase();
    }
    public static void main(String[] args) {

        E115JavaMethods e115JavaMethods = new E115JavaMethods();
        String result = e115JavaMethods.upperCase("test");
        System.out.println(result);
    }
}
