package Assignment4.Strategy;

/*
 Конкретная реализация стратегии оплаты для наложенного платежа.
 Фиксированная плата 300 единиц добавляется к сумме заказа за доставку.
 */
public class CashOnDeliveryStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double orderAmount) {
        return orderAmount + 300;
    }
}
