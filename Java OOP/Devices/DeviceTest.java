public class DeviceTest {
    public static void main(String[] args) {
        Phone phone = new Phone(); 
        phone.makeCall();
        phone.makeCall();
        phone.playGame();
        phone.playGame();
        phone.playGame();
        phone.playGame();
        phone.playGame();
        phone.playGame();
        phone.makeCall();
        phone.makeCall();
        phone.makeCall();
        System.out.println(phone.getBattery());
    }
}   