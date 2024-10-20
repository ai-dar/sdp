import Assignment4.Observer.*;
import Assignment4.State.Player;
import Assignment4.Strategy.*;
import Assignment4.Template.*;
import Assignment4.Visitor.*;

public class Main {
    public static void main(String[] args) {
        // Observer

        // Создаем издателя новостей
        NewsPublisherImpl newsPublisher = new NewsPublisherImpl();

        // Создаем подписчиков: смартфон, ноутбук и планшет
        Observer smartphoneSubscriber = new NewsSubscriberSmartphone();
        Observer laptopSubscriber = new NewsSubscriberLaptop();
        Observer tabletSubscriber = new NewsSubscriberTablet();

        // Добавляем подписчиков к издателю новостей
        newsPublisher.subscribe(smartphoneSubscriber);
        newsPublisher.subscribe(laptopSubscriber);
        newsPublisher.subscribe(tabletSubscriber);

        // Публикуем несколько новостей
        newsPublisher.publishNews("Sports", "Team loses the match!");
        newsPublisher.publishNews("Science", "New scientific breakthrough!");
        newsPublisher.publishNews("Politics", "The next Presidential elections will be soon!");

        System.out.println();

        // State

        // Создаем объект плеера
        Player player = new Player();

        // Выполняем различные действия с плеером: игра, пауза, остановка
        player.play();
        player.pause();
        player.play();
        player.stop();
        player.pause();

        System.out.println();

        // Strategy

        // Создаем заказ на сумму 1000
        Order order = new Order(1000);

        // Устанавливаем стратегию оплаты по карте и выводим финальную сумму
        order.setPaymentStrategy(new CardPaymentStrategy());
        System.out.println("Final amount with card payment: " + order.calculateFinalAmount());

        // Устанавливаем стратегию оплаты из кошелька и выводим финальную сумму
        order.setPaymentStrategy(new WalletPaymentStrategy());
        System.out.println("Final amount with wallet payment: " + order.calculateFinalAmount());

        // Устанавливаем стратегию оплаты наложенным платежом и выводим финальную сумму
        order.setPaymentStrategy(new CashOnDeliveryStrategy());
        System.out.println("Final amount with cash on delivery: " + order.calculateFinalAmount());

        System.out.println();

        // Template

        // Проверка качества продуктов питания
        QualityCheck foodCheck = new FoodQualityCheck();
        System.out.println("Food product quality check:");
        foodCheck.checkProduct();

        // Проверка качества электронной продукции
        QualityCheck electronicsCheck = new ElectronicsQualityCheck();
        System.out.println("Electronics product quality check:");
        electronicsCheck.checkProduct();

        System.out.println();

        // Visitor

        // Создаем файлы: текстовые и исполняемые
        File textFile = new TextFile("document.txt", "This is a clean document.");
        File bannedTextFile = new TextFile("bannedDocument.txt", "banned");
        File executableFile = new ExecutableFile("program.exe", "safe_code");
        File malvareExecutableFile = new ExecutableFile("suspiciousProgram.exe", "malware");

        // Создаем посетителей: антивирус и отчет
        Visitor antivirus = new AntivirusVisitor();
        Visitor report = new ReportVisitor();

        // Антивирусная проверка
        System.out.println("Antivirus check:");
        textFile.accept(antivirus);
        bannedTextFile.accept(antivirus);
        executableFile.accept(antivirus);
        malvareExecutableFile.accept(antivirus);

        // Генерация отчета
        System.out.println("\nGenerating report:");
        textFile.accept(report);
        executableFile.accept(report);

    }
}
