package org.example.e131;

import java.util.Arrays;

public class E131StaticKeyword {
    static String thirdLetter (String s) {
        String str = "";
        String [] word = s.split(" ");
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word[i].length(); j+=3) {
                str = str + word[i].charAt(j);
            }
        }

        return str;
    }
    public static void main(String[] args) {
        String result = thirdLetter("hello there");
        System.out.println(result);

        result = thirdLetter("technology");
        System.out.println(result);
    }
}
