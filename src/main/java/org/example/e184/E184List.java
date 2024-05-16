package org.example.e184;

import java.util.ArrayList;
import java.util.List;

public class E184List {
    public static void main(String[] args){
        List <Integer> integerList = new ArrayList<>();
        integerList.add(111);
        integerList.add(222);
        integerList.add(333);
        integerList.add(444);
        integerList.add(555);
        integerList.add(666);

        for (int i = 0; i < integerList.size(); i++) {
            if (i==0 || i==2 || i==4){
                System.out.println(integerList.get(i));
            }
        }

    }

}
