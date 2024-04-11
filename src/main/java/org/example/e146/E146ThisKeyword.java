package org.example.e146;

class Employee {
    protected String name;
    protected String lastName;
    protected int employeeId;
    protected String startDate;
    protected int salary;

    Employee() {

    }

    Employee(String name, String lastName, int employeeId, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.salary = salary;
    }

    void printEmployeeInfo() {
        System.out.println(name + " " + lastName + " " + employeeId + " " + startDate + " " + salary);
    }
}

public class E146ThisKeyword {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.printEmployeeInfo();

        Employee employee2 = new Employee("Joe", "Smith", 12345, "01/01/1970",35000);
        employee2.printEmployeeInfo();

    }
}
