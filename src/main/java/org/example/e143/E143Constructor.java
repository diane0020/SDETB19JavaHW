package org.example.e143;

class Car {
    protected String make;
    protected  String model;
    protected int numberOfDoors;
    protected int topSpeed;
    protected double price;

    Car(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    Car(String make, String model, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.price = price;
        numberOfDoors = 4;
    }

    Car(int numberOfDoors, int topSpeed, double price) {
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
        make = "unknown";
        model = "unknown";
    }

    Car(String make, String model, int numberOfDoors) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        topSpeed = 90;
        price = 0;
    }

    void printCarInfo() {
        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
    }
}
public class E143Constructor {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Prius", 4, 120, 30000);
        car1.printCarInfo();

        Car car2 = new Car("Toyota", "Prius",120, 30000);
        car2.printCarInfo();

        Car car3 = new Car(4,120,30000);
        car3.printCarInfo();

        Car car4 = new Car("Toyota", "Prius",4);
        car4.printCarInfo();

    }
}


