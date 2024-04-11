package org.example.e148;

class ShoppingStore {
    protected String item;
    private double price;
    protected int quantity;
    static private double totalPrice;

    ShoppingStore (String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    void purchasedItem() {
        totalPrice += (price * quantity);
    }
    static double itemTotalPrice () {
        return totalPrice;
    }

    static void resetTotalPrice() {
        totalPrice = 0;
    }

    void printItem() {
        System.out.println(item + " Total Value " + price);
    }
}

public class E148ThisKeyword {
    public static void main(String[] args) {
        ShoppingStore item1 = new ShoppingStore("Blanket", 99.98,1);
        ShoppingStore item2 = new ShoppingStore("Mattress", 439.18,1 );
        item1.printItem();
        item1.purchasedItem();
        item2.printItem();
        item2.purchasedItem();

        double totalPrice = ShoppingStore.itemTotalPrice();
        System.out.println("You purchased " + totalPrice + " Today");
        ShoppingStore.resetTotalPrice();

    }
}
   