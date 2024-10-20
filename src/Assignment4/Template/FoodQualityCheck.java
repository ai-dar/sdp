package Assignment4.Template;

/*
 Конкретная реализация проверки качества для продуктов питания.
 Включает проверки срока годности и состава продуктов.
 */
public class FoodQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecifics() {
        System.out.println("Checking food expiration date...");
        System.out.println("Checking food composition...");
    }
}
