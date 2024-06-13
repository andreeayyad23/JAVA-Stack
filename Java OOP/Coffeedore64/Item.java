public class Item {
    private int intIndex;
    private String name;
    private double price;

    
    public Item(int intIndex, String name, double price){
        this.name = name;
        this.price = price;
        this.intIndex = intIndex;
    }
    
    // Name Getter
    public String getName() {
        return name;
    }

    // Name Setter
    public void setName(String name){
        this.name = name;
    }

    // Price Getter
    public double getPrice() {
        return price;
    }

    // Price Setter
    public void setPrice(double price){
        this.price = price;
    }

    // IntIndex Getter
    public int getIntIndex() {
        return intIndex;
    }
    
    // IntIndex Setter
    public void setIntIndex(int intIndex){
        this.intIndex = intIndex;
    }

    public void displayItem(){
        System.out.println(this.intIndex + " " + this.name + ": $" + this.price);
    }

}
