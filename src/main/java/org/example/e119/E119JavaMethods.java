package org.example.e119;

public class E119JavaMethods {

    String censorLetter(String s, char x) {
        return s.replace(x, '*');
    }
    public static void main(String[] args) {
        E119JavaMethods e119JavaMethods = new E119JavaMethods();

        String str = e119JavaMethods.censorLetter("computer science",'e');
        System.out.println(str);

        str = e119JavaMethods.censorLetter("trick or treat", 't');
        System.out.println(str);
    }

}
