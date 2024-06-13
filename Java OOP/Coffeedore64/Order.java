import java.util.ArrayList;
public class Order {
    private String name;
    private boolean ready = false;
    private ArrayList<Item> items = new ArrayList<Item>(); 


    public Order(){
    this.name = "Person";
    }

    public Order(String name){
    this.name = name;
    this.items = new ArrayList<Item>();
    }

    // Name Getter
    public String getName() {
            return name;
        }
    
    // Name Setter
    public void setPrice(String name){
        this.name = name;
    }

    // Ready Getter
    public boolean getReady(boolean ready){
        return ready;
    }

    // Ready Setter
    public void setReady(boolean ready){
        this.ready = ready;
    }

    // ItemList Getter
    public ArrayList<Item> getItems(){
        return items;
    }

    // ItemList Setter
    public void setItems(ArrayList<Item> items){
        this.items = items;
    }




    // add Item
    public ArrayList<Item> addItem(Item item){
        ArrayList<Item> itemList = getItems();
        itemList.add(item);
        setItems(itemList);
        return itemList;
    }

    // get Status Message
    public String getStatusMessage(){
        if(this.ready == true){
            return "Your order is ready.";

        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
            
        }
    }

    public double getOrderTotal(){
        double sum = 0;
        for (Item item : getItems()){
            sum += item.getPrice();
        }
        return sum;
    }

    public void display(String name){
        System.out.println("Customer Name:" + name);
        for(Item item: getItems()){
        System.out.println(item.getName() + ":" + item.getPrice());
        }
        System.out.println("Total: $" + getOrderTotal());
    }

}