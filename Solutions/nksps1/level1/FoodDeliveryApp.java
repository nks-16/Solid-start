package Solutions.nksps1.level1;

class FoodDeliveryApp {
    public void placeOrder(String customerName, String itemName, double price) {
        // Store order (in real case, this would go to DB)
        System.out.println("Order placed for " + customerName + ": " + itemName + " - ₹" + price);

        // Listing menu inside same method (bad design)
        System.out.println("Menu: Pizza - ₹250, Burger - ₹150");
    }
}
