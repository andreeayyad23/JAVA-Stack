import java.util.ArrayList;

public class CoffeeKiosk {
    // member variables
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    // constructor
    public CoffeeKiosk() {
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }

    // methods
    public void addMenuItem(Item item){
        menu.add(item);
    }

    public void displayMenu(){
        for(Item item : menu){
            item.displayItem();
        }
    }

    public void newOrder(){
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        displayMenu();
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        Order order1 = new Order();

        while(!itemNumber.equals("q")) {



            if(itemNumber.equals("0")){
                Item item0 = new Item(0, "banana", 2.00);
                order1.addItem(item0);
            }

            if(itemNumber.equals("1")){
                Item item1 = new Item(1, "coffee", 1.50);
                order1.addItem(item1);
            }

            if(itemNumber.equals("2")){
                Item item2 = new Item(2, "latte", 4.50);
                order1.addItem(item2);
            }

            if(itemNumber.equals("3")){
                Item item3 = new Item(3, "capuccino", 3.00);
                order1.addItem(item3);
            }

            if(itemNumber.equals("4")){
                Item item4 = new Item(4, "muffin", 4.00);
                order1.addItem(item4);
            }
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        System.out.println(order1.getItems().size());
        System.out.println("Thank you," + name + ". Here are your order details:");
        order1.display(name);
    }
}