package org.example.e160;

public class E160MethodOverloading {

    void display(int a) {
        System.out.println(a);
    }

    void display(String str) {
        System.out.println(str);
    }

    void display(double a) {
        System.out.println(a);
    }
    public static void main(String[] args){

        E160MethodOverloading e1 = new E160MethodOverloading();

        e1.display(100);
        e1.display("Syntax Technologies");
        e1.display(100.09);

    }
}

