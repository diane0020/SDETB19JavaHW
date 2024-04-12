package org.example.e150;

class Person {
    String name;
     String lastName;
     int age;
}

class Employee extends Person {
    int salary;

    void printEmpInfo() {
        System.out.println(name + " " + lastName + " " + age + " " + salary);
    }

}

class Student extends Employee {
    int grade;

    void printStuInfo() {
        System.out.println(name + " " + lastName + " " + age + " " + grade);
    }
}

class Retiree extends Student {
    String seniorActivity;

    void printSenInfo() {
        System.out.println(name + " " + lastName + " " + age + " " + seniorActivity);
    }
}
public class E150Inheritance {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.name = "Joe";
        emp.lastName = "Smith";
        emp.age = 35;
        emp.salary = 35000;
        emp.printEmpInfo();

        Student student = new Student();
        student.name = "Adam";
        student.lastName = "Smith";
        student.age = 15;
        student.grade = 10;
        student.printStuInfo();

        Retiree retiree = new Retiree();
        retiree.name = "Frank";
        retiree.lastName = "Smith";
        retiree.age = 15;
        retiree.seniorActivity = "tour";
        retiree.printSenInfo();

    }

}
