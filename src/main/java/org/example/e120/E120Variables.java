package org.example.e120;

public class E120Variables {

    int year;
    String schoolName;
    int batchNo;


    public static void main(String[] args) {
        E120Variables e120Variables = new E120Variables();
        int year = e120Variables.year = 2020;
        String schoolName = e120Variables.schoolName = "Syntax";
        int batchNo = e120Variables.batchNo = 6;

        System.out.println("I am a student of batch " + batchNo +  " studying at " + schoolName + " in the year of "+ year);
    }
}