package Solutions.nksps1.level1;

class MenuService {
    public void showMenu() {
        System.out.println("Menu: Pizza - ₹250, Burger - ₹150");
    }
}

class OrderService {
    public void placeOrder(String customerName, String itemName, double price) {
        System.out.println("Order placed for " + customerName + ": " + itemName + " - ₹" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        MenuService menuService = new MenuService();
        OrderService orderService = new OrderService();

        menuService.showMenu();
        orderService.placeOrder("John", "Pizza", 250);
    }
}
