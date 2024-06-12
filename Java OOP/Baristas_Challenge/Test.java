public class Test {
    public static void main(String[] args) {
        Item item1 = new Item("cappuccino", 5.5);
        Item item2 = new Item("latte", 3.5);
        Item item3 = new Item("mocha", 2.5);
        Item item4 = new Item("drip coffee", 1.9);

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Andree");
        Order order4 = new Order("Ayyad");
        Order order5 = new Order("Farah");

        order3.addItem(item1);
        order4.addItem(item1);
        order4.addItem(item2);
        order2.addItem(item3);
        order1.addItem(item4);
        order5.addItem(item4);

        System.out.println("--------- Before State ----------");
        System.out.println(order3.getStatusMessage());

        System.out.println("--------- After State ----------");
        order3.setReady(true);
        System.out.println(order3.getStatusMessage());

        System.out.println("--------------Total for Order 3--------------");
        System.out.println(order3.getOrderTotal());

        System.out.println("--------------Total for Order 1--------------");
        System.out.println(order1.getOrderTotal());

        System.out.println("---------------Display----------------");
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}
