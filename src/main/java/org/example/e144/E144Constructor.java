package org.example.e144;

class StoreProduct {
    protected String label;
    protected double price;
    protected String category;
    protected boolean hasExpiration;
    protected int stock;

    StoreProduct(String label, double price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    StoreProduct(String label, double price, int stock) {
        this.label = label;
        this.price = price;
        this.stock = stock;
        category = "misc";
        hasExpiration = false;
    }

    StoreProduct(String label, double price) {
        this.label = label;
        this.price = price;
        stock = 0;
    }

    void printInfo() {
        System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
    }
}

public class E144Constructor {
    public static void main(String[] args) {
        StoreProduct product1 = new StoreProduct("Eggs", 3, "Produce", true,10);
        product1.printInfo();

        StoreProduct product2 = new StoreProduct("Paper Towels",2,24);
        product2.printInfo();

        StoreProduct product3 = new StoreProduct("Paper Towels", 2);
        product3.printInfo();
    }
}
