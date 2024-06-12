import java.util.ArrayList;

public class Order {
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // initialize with an empty list

    // CONSTRUCTOR
    public Order() {
        this.name = "Guest";
        this.ready = false;
        this.items = new ArrayList<>();
    }

    // OVERLOADED CONSTRUCTOR
    public Order(String name) {
        this.name = name;
        this.ready = false;
        this.items = new ArrayList<>();
    }

    // ORDER METHODS
    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if (this.ready) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double total = 0.0;
        for (Item item : this.items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("Customer Name: " + this.name);
        for (Item item : this.items) {
            System.out.println(item.getName() + ": $" + item.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
}
