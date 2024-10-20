package Assignment4.Template;

/*
 Конкретная реализация проверки качества для электронных товаров.
 Включает проверки функциональности и гарантии электроники.
 */
public class ElectronicsQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecifics() {
        System.out.println("Checking electronics functionality...");
        System.out.println("Checking electronics warranty...");
    }
}
