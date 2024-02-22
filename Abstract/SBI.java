import java.util.*;

public class SBI extends Bank{
    Scanner input = new Scanner(System.in);
    String pin;
    public SBI() {
        System.out.println("welcome to SBI....");
        System.out.println("Enter your pin:");
        pin = input.next();
    }

    public void isCheck() {
        if (pin.length() != 4) {
            System.out.println("Pin must contain 4 digits");
        } 
        else {
            System.out.println("Enter amount:");
            int amount = input.nextInt();
            System.out.println("Your transaction is being processed. Please do not remove the card.");

        }
    }
    public void accNumber() {
        System.out.println("enter account number");
        int number = input.nextInt();
    }

    
}
