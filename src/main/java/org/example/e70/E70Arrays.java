package org.example.e70;

public class E70Arrays {
    public static void main(String[] args) {

        int [] year = new int[11];

        int yearToInput = 2009;

        for (int i=0; i<year.length; i++) {
            year [i] = yearToInput + 1;
            yearToInput = year[i];
            System.out.println(year[i]);
        }

    }
}
