package org.example.e151;


public class E151Inheritance {
    class Method {
        static int sum2D(int[][] num) {
            int sum = 0;
            for (int[] ints : num) {
                for (int anInt : ints) {
                    sum += anInt;

                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {

        int result = Method.sum2D(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });

        System.out.println(result);

    }
}
