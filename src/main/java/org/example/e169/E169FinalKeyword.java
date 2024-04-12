package org.example.e169;

class FinalMethod {
    final double avgElements (int [] num) {
        double average = 0;
        int sum = 0;

        for (int i : num) {
            sum += i;
        }
        average = (double) sum /num.length;
        return average;
    }
}
public class E169FinalKeyword {
    public static void main(String[] args) {

        FinalMethod finalMethod = new FinalMethod();
        double result = finalMethod.avgElements(new int[] {6,4,5,4,5});
        System.out.println(result);
    }

}
