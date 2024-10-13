package Assignment3.Chain;

public class PaymentC extends PaymentHandler {
    @Override
    public void handlePayment(int amount) {
        if (amount >= 200) {
            System.out.println("PaymentC handled the payment of: " + amount);
        }
    }
}