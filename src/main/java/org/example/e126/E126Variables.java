package org.example.e126;

public class E126Variables {

    static int count;

    void counter() {
        count++;
    }

    static int getCount() {
        return count;
    }

    public static void main(String[] args) {


        E126Variables e1 = new E126Variables();
        e1.counter();

        E126Variables e2 = new E126Variables();
        e2.counter();

        E126Variables e3 = new E126Variables();
        e3.counter();

        System.out.println(getCount());


    }

}
