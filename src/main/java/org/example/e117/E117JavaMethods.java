package org.example.e117;

public class E117JavaMethods {

    int sumEvenToX(int x){
        int sum = 0;

        if (x > 0) {
            for (int i = 2; i <= x ; i+=2) {
               sum += i;
            }
        }

        return sum;
    }
    public static void main(String[] args) {

        E117JavaMethods e117JavaMethods = new E117JavaMethods();
        int result = e117JavaMethods.sumEvenToX(5);
        System.out.println(result);
        result = e117JavaMethods.sumEvenToX(8);
        System.out.println(result);
    }

}
