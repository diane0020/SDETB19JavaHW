package org.example.e72;

import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String [] daysOfWeek = new String[7];

        for (int i=0; i<daysOfWeek.length; i++) {
            System.out.println("Please enter day " + (i+1) + " of the week");

            String day = scan.nextLine();
            daysOfWeek[i] = day;
        }

        for (String week: daysOfWeek) {
            System.out.println(week);
        }


    }
}

