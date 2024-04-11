package org.example.e145;

class Dog {
    protected String dogName;
    protected double dogWeight;
    static String dogBreed = "Mutt";

    Dog(String dogName, double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }

    void displayDogInfo() {
        System.out.println(dogName + " " + dogBreed + " " + dogWeight);
    }

}
public class E145ThisKeyword {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Tarzan",50);
        dog1.displayDogInfo();

        Dog dog2 = new Dog("Lucy", 10);
        dog2.displayDogInfo();

    }

}
