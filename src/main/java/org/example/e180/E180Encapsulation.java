package org.example.e180;

public class E180Encapsulation {
    public static void main(String[] args){
        EncapsulationDemo encapsulationDemo = new EncapsulationDemo("John", 30);
        System.out.println("Employee Name: " + encapsulationDemo.getEmpName());
        System.out.print("Employee Age: " + encapsulationDemo.getEmpAge());

    }
}

class EncapsulationDemo {
    private String empName;
    private int empAge;

    EncapsulationDemo(String empName, int empAge) {
        this.empName = empName;
        this.empAge = empAge;
    }

    String getEmpName() {
        return empName;
    }
    int getEmpAge() {
        return empAge;
    }
}



