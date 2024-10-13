import Assignment3.Chain.*;
import Assignment3.Command.*;
import Assignment3.Iterator.*;
import Assignment3.Mediator.*;
import Assignment3.Memento.*;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Цепочка обязанностей
        System.out.println("Chain of Responsibility:");

        // Создаем объекты для каждой платежной системы
        PaymentA paymentA = new PaymentA();
        PaymentB paymentB = new PaymentB();
        PaymentC paymentC = new PaymentC();

        // Устанавливаем следующего обработчика для каждой системы
        paymentA.setNextHandler(paymentB);
        paymentB.setNextHandler(paymentC);

        // Сумма для оплаты
        int amountToPay = 210;

        // Передаем запрос на обработку оплаты
        paymentA.handlePayment(amountToPay);

        // Команда
        System.out.println("\nCommand:");

        // Создаем объект телевизора и пульта
        Television television = new Television();
        RemoteControl remote = new RemoteControl();

        // Назначаем команды для кнопок на пульте
        remote.setCommand(0, new TurnOnCommand(television));
        remote.setCommand(1, new TurnOffCommand(television));
        remote.setCommand(2, new VolumeUpCommand(television));
        remote.setCommand(3, new VolumeDownCommand(television));
        remote.setCommand(4, new NextChannelCommand(television));
        remote.setCommand(5, new PreviousChannelCommand(television));

        // Нажимаем кнопки на пульте
        remote.pressButton(0);  // Включить телевизор
        remote.pressButton(2);  // Увеличить громкость
        remote.pressButton(4);  // Следующий канал
        remote.pressButton(1);  // Выключить телевизор

        // Итератор
        System.out.println("\nIterator:");

        // Создаем коллекции фильмов (список и массив)
        ListMovieCollection listCollection = new ListMovieCollection();
        listCollection.addMovie("Movie A");
        listCollection.addMovie("Movie B");
        listCollection.addMovie("Movie C");

        ArrayMovieCollection arrayCollection = new ArrayMovieCollection(new String[]{"Movie D", "Movie E", "Movie F"});

        // Итератор для списка
        Iterator<String> listIterator = listCollection.createIterator();
        while (listIterator.hasNext()) {
            System.out.println("List Movie: " + listIterator.next());
        }

        // Итератор для массива
        Iterator<String> arrayIterator = arrayCollection.createIterator();
        while (arrayIterator.hasNext()) {
            System.out.println("Array Movie: " + arrayIterator.next());
        }

        // Посредник
        System.out.println("\nMediator:");

        // Создаем посредника и сенсоры
        HomeMediator mediator = new HomeMediatorImpl();
        TemperatureSensor temperatureSensor = new TemperatureSensor(mediator);
        HumiditySensor humiditySensor = new HumiditySensor(mediator);
        LightSensor lightSensor = new LightSensor(mediator);

        // Отправляем данные от сенсоров через посредника
        temperatureSensor.sendData();
        humiditySensor.sendData();
        lightSensor.sendData();

        // Выводим отчет от посредника
        mediator.printReport();


        // Снимок
        System.out.println("\nMemento:");

        // Создаем текстовый редактор и управляющего снимками (Caretaker)
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // Добавляем текст и сохраняем состояние
        editor.addText("Hello, ");
        caretaker.save(editor);

        // Добавляем еще текст и выводим текущее состояние
        editor.addText("World!");
        System.out.println("Current Text: " + editor.getText());

        // Восстанавливаем предыдущее состояние
        caretaker.restore(editor);
        System.out.println("After restoring: " + editor.getText());
    }
}
