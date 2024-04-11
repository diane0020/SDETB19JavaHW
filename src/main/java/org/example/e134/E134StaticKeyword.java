package org.example.e134;

public class E134StaticKeyword {

    static int countVowels(String s) {
        int count = 0;
        String toVowel = s.replaceAll("[^a,e,i,o,u,A,E,I,O,U]","");
        count = toVowel.length();
        return count;
    }
    public static void main(String[] args) {

        System.out.println(countVowels("obama"));
        System.out.println(countVowels("happy friday! i love weekends"));

    }
}

