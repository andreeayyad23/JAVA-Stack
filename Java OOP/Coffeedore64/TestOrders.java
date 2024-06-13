public class TestOrders {
    public static void main(String[] args) {
        CoffeeKiosk TestingOrders = new CoffeeKiosk();

        // Building and displaying the menu
        Item item1 = new Item(0, "banana", 2.00);
        Item item2 = new Item(1, "coffee", 1.50);
        Item item3 = new Item(2, "latte", 4.50);
        Item item4 = new Item(3, "cappuccino", 3.00);
        Item item5 = new Item(4, "muffin", 4.00);

        TestingOrders.addMenuItem(item1);
        TestingOrders.addMenuItem(item2);
        TestingOrders.addMenuItem(item3);
        TestingOrders.addMenuItem(item4);
        TestingOrders.addMenuItem(item5);

        TestingOrders.displayMenu();

        TestingOrders.newOrder();
    }
}
