package org.example.e88;

public class E88ClassAndObject {

    public static void main(String[] args) {

        Main dog1 = new Main();
        dog1.breed = "Husky";
        dog1.name = "Bruno";
        dog1.color = "Salt and Pepper";

        dog1.bark();
        dog1.run();
        dog1.play();

        Main dog2 = new Main();
        dog2.breed = "Bulldog";
        dog2.name = "Oppa";
        dog2.color = "Brown";

        dog2.bark();
        dog2.run();
        dog2.play();

        Main dog3 = new Main();
        dog3.breed = "Labrador";
        dog3.name = "Gib";
        dog3.color = "Gold";

        dog3.bark();
        dog3.run();
        dog3.play();


    }
}
