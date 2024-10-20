package Assignment4.Strategy;

/*Класс контекста, представляющий заказ.
 Он содержит сумму заказа и позволяет применять различные стратегии оплаты.
 */
public class Order {

    private PaymentStrategy paymentStrategy;
    private double orderAmount;

    public Order(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    /*
     Устанавливает стратегию оплаты, которая будет использоваться для расчета окончательной суммы.
     @param paymentStrategy стратегия оплаты, которая будет применена.
     */
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    /*
     Рассчитывает окончательную сумму заказа, применяя выбранную стратегию оплаты.
     @return окончательная сумма после применения стратегии.
     */
    public double calculateFinalAmount() {
        return paymentStrategy.calculateFinalAmount(orderAmount);
    }

}
