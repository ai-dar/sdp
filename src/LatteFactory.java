// Класс LatteFactory реализует интерфейс DarFactory для создания объектов, связанных с латте
public class LatteFactory implements DarFactory {
    // Метод createCoffee создает и возвращает новый объект Latte
    @Override
    public Coffee createCoffee() {
        return new Latte(); // Возвращаем новый экземпляр Latte
    }

    // Метод createMilk создает и возвращает новый объект WholeMilk (цельное молоко)
    @Override
    public Milk createMilk() {
        return new WholeMilk(); // Возвращаем новый экземпляр WholeMilk
    }

    // Метод createSyrup создает и возвращает новый объект VanillaSyrup (ванильный сироп)
    @Override
    public Syrup createSyrup() {
        return new VanillaSyrup(); // Возвращаем новый экземпляр VanillaSyrup
    }

    // Метод createAdditive создает и возвращает новый объект WhippedCream (взбитые сливки)
    @Override
    public Additive createAdditive() {
        return new WhippedCream(); // Возвращаем новый экземпляр WhippedCream
    }
}
