package org.example.e179;

public class E179Encapsulation {
    public static void main(String[] args) {
        EncapsulationDemo EncapsulationDemo = new EncapsulationDemo();
        EncapsulationDemo.setEmpName("Mario");
        EncapsulationDemo.setEmpAge(32);
        System.out.println("Employee Name: " + EncapsulationDemo.getEmpName());
        System.out.println("Employee Age: " + EncapsulationDemo.getEmpAge());

    }
}

class EncapsulationDemo {
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





