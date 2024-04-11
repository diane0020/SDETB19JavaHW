package org.example.e128;
// review and try this again
public class E128StaticKeyword {

    static String mixString(String s1, String s2) {
        String str = "";
        int i = 0, j = 0;
        if (s1.length() == s2.length()) {
            while (i < s1.length() && j < s2.length()) {
                str = str + s1.charAt(i) + s2.charAt(j);
                i++;
                j++;
            }  return str;
        } return str = "String 1 and String 2 must be equal in length";

    }

    public static void main(String[] args) {

        String str = mixString("12345", "abcde");
        System.out.println(str);
    }

}