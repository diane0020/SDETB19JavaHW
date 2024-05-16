package org.example.e182;

import java.text.DateFormat;
import java.util.Date;

class Person {
    private String firstName;
    private String lastName;
    private String birthMonth;
    private String birthYear;
    private String birthDay;
    private String ssn;

    Person(String firstName, String lastName, String birthDay, String birthMonth, String birthYear, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
    }

    String getFirstName() {
        return firstName;
    }
    String getLastName() {
        return lastName;
    }
    String getUsrBirthDay(){
        return  birthMonth + "/" + birthDay + "/" + birthYear;
    }
    String getSsn() {
        return ssn;
    }

    void displayInfo(){
        System.out.println(getFirstName());
        System.out.println(getLastName());
        System.out.println(getUsrBirthDay());
        System.out.println(getSsn());
    }
}
public class E182Encapsulation {
    public static void main(String[] args){
        Person person = new Person("John", "Doe", "25","10","1900","123-45-6789");
        person.displayInfo();
    }
}

