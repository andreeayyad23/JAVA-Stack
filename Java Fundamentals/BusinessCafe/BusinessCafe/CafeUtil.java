import java.util.ArrayList;

/**
 * CafeUtil
 */

public class CafeUtil {

    public Integer getStreakGoal(int numOfWeeks){
        int sum = 0;
        for (int i = 0; i <= numOfWeeks; i++){
            sum += i;
        }
        return sum;
    }
    public Double getOrderTotal(double[] prices){
        double total = 0.0 ;
        for (int i = 0; i< prices.length; i++){
            total += prices [i];
        }
        return total;
    }
    public void displayMenu(ArrayList<String> menuItems){
        System.out.println("Menu Items: ");
        for (int i =0; i < menuItems.size();i++){
            
            System.out.println(i + " " +  menuItems.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name here ---- ");
        String username = System.console().readLine();
        System.out.println("Hello" + " "+ username);
        int customerTotal= customers.size();
        System.out.format("There are currently %03d  people ahead of you", customerTotal);
        customers.add(username);
        System.out.println(customers);
    }
}
