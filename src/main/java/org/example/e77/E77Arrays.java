package org.example.e77;

public class E77Arrays {
    public static void main(int[] args) {
        //write code from here

        int [] num = {5,4,8};

        int max = num[0];

        for (int n: num){
            if (max < n){
                max = n;
            }
        }
        System.out.print(max);

    }
}