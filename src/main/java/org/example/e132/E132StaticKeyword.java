package org.example.e132;

public class E132StaticKeyword {

    static void reduce10(int [][] num) {
        int diff = 0;
        for (int [] i : num) {
            for (int i1 : i) {
                diff = i1 - 10;
                System.out.print(diff + " ");
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {

        reduce10(new int [][] {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        });
    }
}

