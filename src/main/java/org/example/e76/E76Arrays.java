package org.example.e76;

public class E76Arrays {
    public static void main(String[] args) {
     //please write code from here

        double [][] num = {
                {2.8, 4.0, 6.6, 4.0},
                {8.0, 3.0, 12.2, 2.0},
                {2.4, 6.2, 8.0, 3.2}
        };

        for (double [] row: num){ // box for the collection of rows or 1D array
            for (double column: row){ // no box for the collection of variable/values
                System.out.print(column + " ");
            }

            System.out.println();
        }

    }
}
