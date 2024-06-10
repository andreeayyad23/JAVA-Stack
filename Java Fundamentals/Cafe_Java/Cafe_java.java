public class Cafe_java {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 4;
        double dripCoffeePrice = 3;
        double lattePrice = 5;
        double cappuccinoPrice = 6;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1 + pendingMessage); // Displays "Welcome to Cafe Java, Cindhuri"

        System.out.println(generalGreeting + customer4);
        if (isReadyOrder4){
            System.out.println(customer4 + readyMessage +"\n"+ displayTotalMessage + cappuccinoPrice);
        }else{
            System.out.println(customer4 + pendingMessage);
        }

     
        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + lattePrice*2);
        if (isReadyOrder2){
            System.out.println(customer2 + readyMessage);
        }else{
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(customer3 + displayTotalMessage + (lattePrice - dripCoffeePrice));
    }
}