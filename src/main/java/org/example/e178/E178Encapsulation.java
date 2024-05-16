package org.example.e178;

public class E178Encapsulation {
    public static void main(String[] args){

        MyClass myClass = new MyClass();
        myClass.setEmpName("John");
        myClass.setEmpAge(30);
        System.out.println("Employee Name: " + myClass.getEmpName());
        System.out.println("Employee Age: " + myClass.getEmpAge());

    }
}

class MyClass {
    private String empName;
    private int empAge;

    void setEmpName(String empName) {
        this.empName = empName;
    }
    void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    String getEmpName() {
        return empName;
    }
    int getEmpAge() {
        return empAge;
    }
}
