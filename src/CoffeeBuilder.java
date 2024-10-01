// Класс CoffeeBuilder позволяет шаг за шагом создавать кастомный кофе
public class CoffeeBuilder {
    private Coffee coffee; // Переменная для хранения объекта кофе

    // Конструктор класса CoffeeBuilder, принимающий тип кофе
    public CoffeeBuilder(String type) {
        // В зависимости от типа создаем соответствующий объект кофе
        if (type.equalsIgnoreCase("Latte")) {
            coffee = new Latte(); // Создаем латте
        } else if (type.equalsIgnoreCase("Americano")) {
            coffee = new Americano(); // Создаем американо
        } else {
            // Выбрасываем исключение, если тип кофе неизвестен
            throw new IllegalArgumentException("Unknown coffee type");
        }
    }

    // Метод для добавления ингредиента к кофе
    public CoffeeBuilder addIngredient(String ingredient) {
        // Если кофе является латте, добавляем ингредиент в латте
        if (coffee instanceof Latte) {
            ((Latte) coffee).addIngredient(ingredient);
        }
        // Если кофе является американо, добавляем ингредиент в американо
        else if (coffee instanceof Americano) {
            ((Americano) coffee).addIngredient(ingredient);
        }
        return this; // Возвращаем текущий объект CoffeeBuilder для возможности цепочного вызова
    }

    // Метод для завершения сборки и возврата объекта кофе
    public Coffee build() {
        return coffee; // Возвращаем собранный объект кофе
    }
}
