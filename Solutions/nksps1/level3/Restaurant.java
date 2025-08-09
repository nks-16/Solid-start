package Solutions.nksps1.level3;

class Restaurant {
    String name;
    String menu; // Storing menu as plain string — bad idea

    public void showMenu() {
        System.out.println(name + " Menu: " + menu);
    }

    public void placeOrder(String customerName, String itemName, double price) {
        System.out.println("Order placed for " + customerName + " at " + name + ": " + itemName + " - ₹" + price);
    }
}