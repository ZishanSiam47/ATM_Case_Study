package atmachine;
public class Screen {
    
    //displaying
    public void displayMsg(String message) {
        System.out.println(message);
    }
    
    public void displayMsgLine(String message) {
        System.out.println(message);
    }
    
    public void displayDollarAmount(double amount) {
        System.out.printf("$%,.2f", amount);
    }
}
