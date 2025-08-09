package Solutions.nksps1.level2;

interface DiscountStrategy {
    double applyDiscount(double price);
}

class NoDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price;
    }
}

class PizzaDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price - 50;
    }
}

class OrderService {
    public void placeOrder(String customerName, String itemName, double price, DiscountStrategy discount) {
        double finalPrice = discount.applyDiscount(price);
        System.out.println("Order placed for " + customerName + ": " + itemName + " - ₹" + finalPrice);
    }
}

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.placeOrder("John", "Pizza", 250, new PizzaDiscount());
    }
}

