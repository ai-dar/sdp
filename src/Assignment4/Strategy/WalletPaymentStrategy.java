package Assignment4.Strategy;

/*
 Конкретная реализация стратегии оплаты для электронного кошелька.
 Дополнительные сборы или комиссии не добавляются к сумме заказа.
 */
public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double orderAmount) {
        return orderAmount;
    }
}
