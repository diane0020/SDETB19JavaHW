package org.example.e139;

public class E139AccessModifiers {

    public String alphabetical(String str) {
        String s = "";
        StringBuilder str1 = new StringBuilder();
        char prevChar =' ';
        for (int i = 0; i < str.length(); i++) {
            if (prevChar < str.charAt(i)){
                str1.append(str.charAt(i));

            }
            prevChar = str.charAt(i);

        }
        return s = str1.toString();
    }


    public static void main(String[] args) {
        E139AccessModifiers e139 = new E139AccessModifiers();
        System.out.println(e139.alphabetical("hello"));
        System.out.println(e139.alphabetical("software"));
        System.out.println(e139.alphabetical("language"));

    }


}

