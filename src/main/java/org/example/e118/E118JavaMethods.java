package org.example.e118;



public class E118JavaMethods {

    String spaceOut(String s) {
        String str = "";
        for (int i = 0; i < s.length() ; i++) {
            str = str + s.charAt(i) + " ";
        }
        return str;
    }

    public static void main(String[] args) {
        E118JavaMethods e118JavaMethods = new E118JavaMethods();
        String str = e118JavaMethods.spaceOut("hello");
        System.out.println(str);
        str = e118JavaMethods.spaceOut("technology");
        System.out.println(" "+ str);
    }
}
