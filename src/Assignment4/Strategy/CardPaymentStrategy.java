package Assignment4.Strategy;

/*
 Конкретная реализация стратегии оплаты для оплаты картой.
 К сумме заказа добавляется комиссия 2% при оплате картой.
 */
public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double orderAmount) {
        double commission = orderAmount * 0.02;
        return orderAmount + commission;
    }
}
