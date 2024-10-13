package Assignment3.Chain;

public class PaymentA extends PaymentHandler {
    @Override
    public void handlePayment(int amount) {
        if (amount < 100) {
            System.out.println("PaymentA handled the payment of: " + amount);
        } else if (nextHandler != null) {
            nextHandler.handlePayment(amount);
        }
    }
}