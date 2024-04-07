package org.example.e92;

public class E92StringManipulations {
    public static void main(String[] args) {

        String s1 = "hello how are you";
        String [] word = s1.split(" ");

        boolean validateEnd = false;

        for (int i = 0; i < word.length; i++) {
            if (i == (word.length-1)) {
                if (word[i].equals("you")){
                    validateEnd = true;
                    System.out.println(validateEnd);
                } else {
                   validateEnd = false;
                    System.out.println(validateEnd);
                }

            }

        }
/*
        for (int i = 0; i < s1.length(); i++) {
            if (!(i == (s1.length()-1))) {
                continue;
            }
            if (s1.endsWith("u")){
                validateEnd = true;
                System.out.println(validateEnd);
            } else {
                validateEnd = false;
                System.out.println(validateEnd);
            }
        }*/

        if (s1.endsWith("u")){
            validateEnd = true;
            System.out.println(validateEnd);
        } else {
            validateEnd = false;
            System.out.println(validateEnd);
        }

    }
}
