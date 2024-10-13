package Assignment3.Chain;

public class PaymentB extends PaymentHandler {
    @Override
    public void handlePayment(int amount) {
        if (amount >= 100 && amount < 200) {
            System.out.println("PaymentB handled the payment of: " + amount);
        } else if (nextHandler != null) {
            nextHandler.handlePayment(amount);
        }
    }
}