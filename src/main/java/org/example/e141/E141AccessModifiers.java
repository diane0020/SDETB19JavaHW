package org.example.e141;

public class E141AccessModifiers {
    public int maxValue(int [] num) {
        int max = num[0];
        for (int i : num) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        E141AccessModifiers e141 = new E141AccessModifiers();
        System.out.println(e141.maxValue(new int[] {3,1,5,7,22,19,16}));

    }
}
