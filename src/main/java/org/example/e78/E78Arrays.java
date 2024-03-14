package org.example.e78;

public class E78Arrays {
    public static void main(int [][] args) {
        //write the code from here

        int [][] num = {
                {-1, -2, -3},
                {-1, -2}
        };

        int sum = 0;
        for (int [] rowNum: num){
            for (int columnNum: rowNum){
                sum += columnNum;
            }

        }
        System.out.println(sum);

    }
}
