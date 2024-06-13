public class Phone extends Device {


    public void makeCall(){
        int battery = getBattery();
        setBattery(battery -= 5);
        checkBattery();
    }
    
    
    public void playGame(){
        int battery = getBattery();
        if(battery < 25){
            System.out.println("Battery too low for game");
            return;
        }
        setBattery(battery -= 20);
        checkBattery();
    }

    public void charge(){
        int battery = getBattery();
        setBattery(battery += 50);

    }



    
}