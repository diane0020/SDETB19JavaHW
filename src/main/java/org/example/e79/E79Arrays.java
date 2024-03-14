package org.example.e79;

public class E79Arrays {
    public static void main(int [][] args) {
        //please write the code from here

        int [][] num = {
                {1,1,2},
                {3,1,2},
                {3,5,3},
                {0,1,2}
        };

        int rowSum = 0;

        for (int [] row: num){
            for (int col: row){
                rowSum += col;

            }
            System.out.println(rowSum);
            rowSum = 0;
        }

    }
}

