import java.util.ArrayList;
import java.util.Arrays;
public class TestCafe {
    public static void main(String[] args) {
        CafeUtil cafe = new CafeUtil();
        int result = cafe.getStreakGoal(15);
        System.out.println("Total number of drinks after 10 weeks: " + result);
        double result2 = cafe.getOrderTotal(new double[]{1.0, 2.0, 3.0});
        System.out.format("The total is :  %s", result2);
        
        
        // Create and populate the ArrayList with menu items
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("Coffee");
        menuItems.add("Tea");
        menuItems.add("Cappuccino");
        menuItems.add("Latte");
        cafe.displayMenu(menuItems);

        ArrayList<String> customers= new ArrayList<>();
        cafe.addCustomer(customers);

    /* 
      You will need add 1 line to this file to create an instance 
      of the CafeUtil class. 
      Hint: it will need to correspond with the variable name used below..
    */
    	
        /* ============ App Test Cases ============= */
    
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", cafe.getStreakGoal(10));
    
        // System.out.println("----- Order Total Test-----");
        // double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        // System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        
        // System.out.println("----- Display Menu Test-----");
        
        // ArrayList<String> menu = new ArrayList<String>();
        // menu.add("drip coffee");
        // menu.add("cappuccino");
        // menu.add("latte");
        // menu.add("mocha");
        // appTest.displayMenu(menu);
    
        // System.out.println("\n----- Add Customer Test-----");
        // ArrayList<String> customers = new ArrayList<String>();
        // // --- Test 4 times ---
        // for (int i = 0; i < 4; i++) {
        //     appTest.addCustomer(customers);
        //     System.out.println("\n");
        // }
    }
}
