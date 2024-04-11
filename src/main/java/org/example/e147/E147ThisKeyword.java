package org.example.e147;

class Car{
    protected String make;
    protected int model;
    protected int quantity;
    protected double modelPrice;

    Car(String make, int model, int quantity, double modelPrice){
        this.make = make;
        this.model = model;
        this.quantity = quantity;
        this.modelPrice = modelPrice;
    }

    double carStockValue () {
        double stockValue = 0;

        return stockValue = (quantity * modelPrice);
    }

    void printCarInfo() {
        System.out.println(make + " " + model + " Stock Value " + carStockValue());
    }
}

public class E147ThisKeyword {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", 2019,2500,1000);
        car1.printCarInfo();

        Car car2 = new Car("BMW", 2019, 100, 6529.8);
        car2.printCarInfo();


    }
}
