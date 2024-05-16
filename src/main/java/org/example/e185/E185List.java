package org.example.e185;

import java.util.ArrayList;

public class E185List {
    public static void main(String[] args){
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(111);
        integerArrayList.add(111);
        integerArrayList.add(111);
        integerArrayList.add(999);
        integerArrayList.add(999);
        integerArrayList.add(999);

        for (Integer i : integerArrayList) {
            System.out.println(i);

        }

    }

}
