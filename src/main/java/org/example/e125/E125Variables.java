package org.example.e125;

import org.example.e124.E124Variables;

public class E125Variables{

    static int a;

    public static void main(String[] args) {

        E125Variables e1 = new E125Variables();

        E125Variables.a = 200;
        e1.a = 200;

        System.out.println(E125Variables.a);
        System.out.println(e1.a);
    }
}
