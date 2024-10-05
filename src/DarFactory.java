// Интерфейс DarFactory определяет методы для создания семейства взаимосвязанных объектов
public interface DarFactory {
    // Метод для создания объекта типа Coffee
    Coffee createCoffee();

    // Метод для создания объекта типа Milk
    Milk createMilk();

    // Метод для создания объекта типа Syrup
    Syrup createSyrup();

    // Метод для создания объекта типа Additive
    Additive createAdditive();
}
