
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Singleton Pattern
        DarCoffee zakaz1 = DarCoffee.getInstance();
        zakaz1.placeOrder("Latte");
        DarCoffee zakaz2 = DarCoffee.getInstance();
        zakaz2.placeOrder("Americano");
        System.out.println(zakaz1 == zakaz2);

        //Factory Method
        DarFactory coffeeFactory = createCoffeeByType("Latte");
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.prepare();

        //Abstract Method
        // Приготовление Latte
        DarFactory latteFactory = new LatteFactory();
        Coffee latte = latteFactory.createCoffee();
        Milk latteMilk = latteFactory.createMilk();
        Syrup latteSyrup = latteFactory.createSyrup();
        Additive latteAdditive = latteFactory.createAdditive();
        // Приготовление Latte
        latte.prepare();
        System.out.println("Using: " + latteMilk.getMilkType());
        System.out.println("With syrup: " + latteSyrup.getSyrupType());
        System.out.println("Additive: " + latteAdditive.getAdditiveType());
        System.out.println();
        // Создание фабрики для Americano
        DarFactory americanoFactory = new AmericanoFactory();
        Coffee americano = americanoFactory.createCoffee();
        Milk americanoMilk = americanoFactory.createMilk();
        Syrup americanoSyrup = americanoFactory.createSyrup();
        Additive americanoAdditive = americanoFactory.createAdditive();
        // Приготовление Americano
        americano.prepare();
        System.out.println("Using: " + americanoMilk.getMilkType());
        System.out.println("With syrup: " + americanoSyrup.getSyrupType());
        System.out.println("Additive: " + americanoAdditive.getAdditiveType());

        //Prototype
        // Создаем оригинальный заказ кофе
        Coffee originalLatte = new Latte();
        originalLatte.prepare();
        // Клонируем оригинальный заказ
        Coffee clonedLatte = ((Latte) originalLatte).clone();
        clonedLatte.prepare();
        // Создаем оригинальный заказ кофе Американо
        Coffee originalAmericano = new Americano();
        originalAmericano.prepare();
        // Клонируем оригинальный заказ
        Coffee clonedAmericano = ((Americano) originalAmericano).clone();
        clonedAmericano.prepare();


        //Builder
        // Создание кастомного кофе с использованием строителя
        Coffee customLatte = new CoffeeBuilder("Latte")
                .addIngredient("Whole Milk")
                .addIngredient("Vanilla Syrup")
                .build();

        // Подготовка кастомного латте
        customLatte.prepare();

    }

    static DarFactory createCoffeeByType(String type) {
        if (type.equalsIgnoreCase("Americano")) {
            return new AmericanoFactory();
        } else if (type.equalsIgnoreCase("Latte")) {
            return new LatteFactory();
        } else {
            throw new RuntimeException(type + " is unknown coffee type");
        }
    }
}