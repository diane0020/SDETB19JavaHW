package org.example.e135;

public class E135StaticKeyword {

    static String surround(String s,  char searchTerm){
        String surroundString = "";
        StringBuilder str = new StringBuilder(s);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == searchTerm) {
                surroundString = String.valueOf(str.insert(i,"("));
                surroundString = String.valueOf(str.insert(i+2,")"));
                i += 2;

            }
        }

        return surroundString;

    }
  
    public static void main(String[] args) {

        System.out.println(surround("abcabcabc",'c'));
        System.out.println(surround("technology",'o'));

    }
}

