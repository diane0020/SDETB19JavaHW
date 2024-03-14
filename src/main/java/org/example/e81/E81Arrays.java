package org.example.e81;

public class E81Arrays {
    public static void main(int [][] args) {
        //write the code from here

        //sum of all number on EVEN Index and EVEN row

        int [][] num = {
                {12,5,8},
                {-8,1,3},
                {-20,5,-4}
        };

        int rowSum = 0;

        for (int i=0; i< num.length;i++){
            for (int j=0; j<num[i].length; j++){
                if ((i%2)!=0 || (j%2)!=0){
                    continue;
                }
                rowSum += num[i][j];
            }
        }

        System.out.println(rowSum);


    }
}
