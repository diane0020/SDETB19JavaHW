package org.example.e122;


public class E122Variables {
    String countryName;
    String countryCapital;
    long countryPopulation;
    public static void main(String[] args) {
        E122Variables e1 = new E122Variables();
        String country = (e1.countryName = "USA");
        String capital = (e1.countryCapital = "Washington DC");
        long population = (e1.countryPopulation = 330000000);
        System.out.println("The capital of " + country + " is "+capital+" and population is "+ population);

        E122Variables e2 = new E122Variables();
        country = (e2.countryName = "Kazakhstan");
        capital = (e2.countryCapital = "Astana");
        population = (e2.countryPopulation = 18500000);
        System.out.println("The capital of " + country + " is "+capital+" and population is "+ population);


    }
}
