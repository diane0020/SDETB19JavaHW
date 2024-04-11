package org.example.e137;

public class E137AccessModifiers {
    protected String name;
    public String city;
    String nameOfTheSchool;
    private int batchNo;
    public static void main(String[] args) {

        E137AccessModifiers e137 = new E137AccessModifiers();
        String name = (e137.name = "John");
        String city = (e137.city = "Miami");
        String schoolName = (e137.nameOfTheSchool = "Syntax");
        int batchNo = (e137.batchNo = 9);

        System.out.println("My name is " + name + " and I live in " + city + ". I study at " + schoolName + " in batch " + batchNo);


    }
}

