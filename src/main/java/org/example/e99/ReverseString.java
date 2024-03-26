package org.example.e99;

public class ReverseString {

    public String reverse (String word) {
        String reversed = "";

        for (int i = (word.length()-1); i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        return reversed;
    }
}
