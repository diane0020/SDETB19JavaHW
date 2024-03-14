package org.example.e80;

public class E80Arrays {
    public static void main(int[] args) {
        // please write code from here

        int [] num = {1,2,-3,-4,5,6,7,8,9,10};

        for (int n: num){
            if ((n%2)!= 0 && n<0) {
                System.out.print(n*-1);
            }
        }

    }
}
