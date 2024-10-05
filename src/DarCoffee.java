public class DarCoffee {
    private static DarCoffee instance;

    private DarCoffee() {}

    public static DarCoffee getInstance() {
        if (instance == null) {
            instance = new DarCoffee();
        }
        return instance;
    }

    public void placeOrder(String coffee) {
        System.out.println("Order placed for: " + coffee);
    }
}
