package org.example.e127;

public class E127StaticKeyword {

    void printMessage(){
        System.out.println("Programming is amazing.");
    }

    static void printPhrase() {
        System.out.println("Java is awesome.");
    }

    public static void main(String[] args) {
        E127StaticKeyword e1 = new E127StaticKeyword();
        e1.printMessage();
        printPhrase();

    }
}