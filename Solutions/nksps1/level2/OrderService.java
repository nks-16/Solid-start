package Solutions.nksps1.level2;

class OrderService {
    public void placeOrder(String customerName, String itemName, double price) {
        if (itemName.equalsIgnoreCase("Pizza")) {
            price -= 50; // Hardcoded discount for pizza
        }
        System.out.println("Order placed for " + customerName + ": " + itemName + " - ₹" + price);
    }
}

