package org.example.e130;

public class E130StaticKeyword {

    static void mysteryNum (int [] numArr) {
        int result = 0;
        for (int i : numArr) {
            if ((i%2) == 0) {
                result = i / 2;
            } else {
                result = i * 10;
            }
            System.out.print(result + " ");
        }
    }
    public static void main(String[] args) {
        mysteryNum(new int[]{1, 2, 3, 4, 5});

    }
}
