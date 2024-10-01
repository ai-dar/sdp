// Класс AmericanoFactory реализует интерфейс DarFactory для создания объектов, связанных с американо
public class AmericanoFactory implements DarFactory {
    // Метод createCoffee создает и возвращает новый объект Americano
    @Override
    public Coffee createCoffee() {
        return new Americano(); // Возвращаем новый экземпляр Americano
    }

    // Метод createMilk создает и возвращает новый объект SkimMilk (обезжиренное молоко)
    @Override
    public Milk createMilk() {
        return new SkimMilk(); // Возвращаем новый экземпляр SkimMilk
    }

    // Метод createSyrup создает и возвращает новый объект HazelnutSyrup (фунтовый сироп)
    @Override
    public Syrup createSyrup() {
        return new HazelnutSyrup(); // Возвращаем новый экземпляр HazelnutSyrup
    }

    // Метод createAdditive создает и возвращает новый объект Cinnamon (корица)
    @Override
    public Additive createAdditive() {
        return new Cinnamon(); // Возвращаем новый экземпляр Cinnamon
    }
}
