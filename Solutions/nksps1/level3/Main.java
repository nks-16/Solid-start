package Solutions.nksps1.level3;

import java.util.*;

class MenuItem {
    String name;
    double price;

    MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

interface DiscountStrategy {
    double applyDiscount(double price);
}

class NoDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price;
    }
}

class Restaurant {
    String name;
    List<MenuItem> menu;
    DiscountStrategy discountStrategy;

    Restaurant(String name, DiscountStrategy discountStrategy) {
        this.name = name;
        this.menu = new ArrayList<>();
        this.discountStrategy = discountStrategy;
    }

    public void addMenuItem(String itemName, double price) {
        menu.add(new MenuItem(itemName, price));
    }

    public void showMenu() {
        System.out.println(name + " Menu:");
        for (MenuItem item : menu) {
            System.out.println(item.name + " - ₹" + item.price);
        }
    }

    public void placeOrder(String customerName, String itemName) {
        for (MenuItem item : menu) {
            if (item.name.equalsIgnoreCase(itemName)) {
                double finalPrice = discountStrategy.applyDiscount(item.price);
                System.out.println("Order placed for " + customerName + " at " + name + ": " + itemName + " - ₹" + finalPrice);
                return;
            }
        }
        System.out.println("Item not found!");
    }
}

public class Main {
    public static void main(String[] args) {
        Restaurant dominos = new Restaurant("Dominos", price -> price - 50);
        dominos.addMenuItem("Pizza", 250);
        dominos.addMenuItem("Burger", 150);

        Restaurant kfc = new Restaurant("KFC", new NoDiscount());
        kfc.addMenuItem("Chicken Wings", 300);

        dominos.showMenu();
        dominos.placeOrder("Alice", "Pizza");

        kfc.showMenu();
        kfc.placeOrder("Bob", "Chicken Wings");
    }
}