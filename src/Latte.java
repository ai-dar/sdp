import java.util.ArrayList;  // Импортируем класс ArrayList для использования динамического списка
import java.util.List;       // Импортируем интерфейс List

// Класс Latte представляет собой конкретный вид кофе
public class Latte implements Coffee {
    // Список ингредиентов для латте
    private List<String> ingredients = new ArrayList<>();

    // Конструктор класса Latte
    public Latte() {
        // Инициализируем список ингредиентов
        ingredients = new ArrayList<>();
        // Добавляем базовые ингредиенты латте
        ingredients.add("Espresso");
        ingredients.add("Steamed Milk");
    }

    // Метод prepare() выводит на экран процесс приготовления латте
    @Override
    public void prepare() {
        System.out.println("Preparing a Latte with the following ingredients:");
        // Перечисляем все ингредиенты
        for (String ingredient : ingredients) {
            System.out.println(ingredient);
        }
    }

    // Метод для добавления ингредиентов в латте
    public void addIngredient(String ingredient) {
        ingredients.add(ingredient); // Добавляем новый ингредиент в список
    }

    // Метод clone() для клонирования объекта Latte
    @Override
    public Coffee clone() {
        try {
            // Используем super.clone() для создания копии текущего объекта
            Latte cloned = (Latte) super.clone();
            // Клонируем список ингредиентов
            cloned.ingredients = new ArrayList<>(this.ingredients);
            return cloned; // Возвращаем клонированный объект
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Failed to clone Latte", e); // Обработка исключения
        }
    }
}
