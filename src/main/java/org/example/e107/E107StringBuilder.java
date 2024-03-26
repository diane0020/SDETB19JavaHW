package org.example.e107;

public class E107StringBuilder {
    public static void main(String[] args) {

        String string = "Hello Friends";

        StringBuilder toReverve = new StringBuilder(string);
        toReverve.reverse();

        String reversed = toReverve.toString();
        System.out.println(reversed);

    }
}
