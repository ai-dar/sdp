// Интерфейс Coffee представляет собой базовый интерфейс для всех видов кофе
public interface Coffee extends Cloneable {  // Coffee может быть клонирован для паттерна Prototype
    void prepare(); // Метод для приготовления кофе
}

// Интерфейс Milk представляет собой абстракцию для различных видов молока
interface Milk {
    String getMilkType(); // Метод для получения типа молока
}

// Интерфейс Syrup представляет собой абстракцию для различных видов сиропов
interface Syrup {
    String getSyrupType(); // Метод для получения типа сиропа
}

// Интерфейс Additive представляет собой абстракцию для различных добавок
interface Additive {
    String getAdditiveType(); // Метод для получения типа добавки
}
