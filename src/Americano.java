import java.util.ArrayList;  // Импортируем класс ArrayList для использования динамического списка
import java.util.List;       // Импортируем интерфейс List

// Класс Americano представляет собой конкретный вид кофе
public class Americano implements Coffee {
    // Список ингредиентов для американо
    private List<String> ingredients = new ArrayList<>();

    // Конструктор класса Americano
    public Americano() {
        // Инициализируем список ингредиентов
        ingredients = new ArrayList<>();
        // Добавляем базовые ингредиенты для американо
        ingredients.add("Espresso");
        ingredients.add("Hot Water");
    }

    // Метод prepare() выводит на экран процесс приготовления американо
    @Override
    public void prepare() {
        System.out.println("Preparing an Americano with the following ingredients:");
        // Перечисляем все ингредиенты
        for (String ingredient : ingredients) {
            System.out.println(ingredient);
        }
    }

    // Метод для добавления ингредиентов в американо
    public void addIngredient(String ingredient) {
        ingredients.add(ingredient); // Добавляем новый ингредиент в список
    }

    // Метод clone() для клонирования объекта Americano
    @Override
    public Coffee clone() {
        try {
            // Используем super.clone() для создания копии текущего объекта
            Americano cloned = (Americano) super.clone();
            // Клонируем список ингредиентов
            cloned.ingredients = new ArrayList<>(this.ingredients);
            return cloned; // Возвращаем клонированный объект
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Failed to clone Americano", e); // Обработка исключения
        }
    }
}
